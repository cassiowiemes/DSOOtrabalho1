package ctrl;
import java.util.ArrayList;
import java.util.Collection;
import utils.ChaveInvalidaException;
import utils.EmprestimoWrapper;
import utils.Mapeador;
import utils.TabelaAtrasos;
import model.Emprestimo;
import view.TelaEmprestimo;

public class CtrlEmprestimo {

    private CtrlPrincipal ctrl;
    private Mapeador<Emprestimo> mapeador;
    private TelaEmprestimo tela;
    private final int DATA_ATUAL = 27;

    public CtrlEmprestimo(CtrlPrincipal ctrl) {
        this.ctrl = ctrl;
        this.tela = new TelaEmprestimo(this);
        mapeador = new Mapeador<>("emprestimos.txt");
        mapeador.setLastId(mapeador.getHighestKey());
    }

    public void iniciar() {
    	tela.setVisible(true);
    }
    
    public ArrayList<EmprestimoWrapper> emprestimosAtrasados(){
    	Collection<Emprestimo> emprestimos = mapeador.getValues();
    	ArrayList<EmprestimoWrapper> atrasos = new ArrayList<>();
    	for(Emprestimo emprestimo : emprestimos){
    		if(emprestimo.getDataPlanejadaDevolucao() < DATA_ATUAL){
    			EmprestimoWrapper pacote = new EmprestimoWrapper();
    			pacote.dataEmprestimo = emprestimo.getDataEmprestimo();
    			pacote.dataDevolucao = emprestimo.getDataDevolucao();
    			pacote.dataPlanejadaDevolucao = emprestimo.getDataPlanejadaDevolucao();
    			pacote.id = emprestimo.getId();
    			pacote.usuario = emprestimo.getNomeUsuario();
    			pacote.exemplar = emprestimo.getCodigoExemplar();
    			atrasos.add(pacote);
    		}
    	}
    	return atrasos;
    }
    
    public void efetuaEmprestimo(Integer codigoUsuario, Integer codigoExemplar,
    		int dataEmprestimo) throws ChaveInvalidaException {
    	Emprestimo emprestimo = new Emprestimo(ctrl.getUsuario(codigoUsuario),
    			ctrl.getExemplar(codigoExemplar));
    	try{
	    	if(emprestimo.isUsuarioDisponivel() && emprestimo.isExemplarDisponivel()){
	    		mapeador.incrementId();
	    		emprestimo.setId(mapeador.getId());
	    		emprestimo.efetuaEmprestimo(dataEmprestimo);
	    		mapeador.put(emprestimo.getId(), emprestimo);
	    		tela.sucessoCriar(emprestimo.getId());
	    	}
    	}catch(NullPointerException e){
    		tela.campoInvalido();
    	}
    }
    
    public void efetuaDevolucao(Integer codigoEmprestimo, int dataDevolucao) 
    		throws ChaveInvalidaException{
    	Emprestimo emprestimo = mapeador.get(codigoEmprestimo);
    	if(emprestimo == null) throw new ChaveInvalidaException();
		if(emprestimo.getDataPlanejadaDevolucao() < dataDevolucao){
			tela.mostraMulta(emprestimo.getMulta(dataDevolucao));
		}
		emprestimo.efetuaDevolucao(dataDevolucao);
		tela.sucesso();
    }

	public void realizaAcao(String command) throws ChaveInvalidaException {
		EmprestimoWrapper emprestimo;
		switch(command){
		case "Salvar Emprestimo":
			emprestimo = tela.getDadosEmprestimo();
			if(emprestimo == null) break;
			efetuaEmprestimo(emprestimo.codigoUsuario, emprestimo.codigoExemplar,
					emprestimo.dataEmprestimo);
			break;
		case "Salvar Devolucao":
			emprestimo = tela.getDadosDevolucao();
			if(emprestimo == null) break;
			efetuaDevolucao(emprestimo.id, emprestimo.dataDevolucao);
			break;
		case "Voltar":
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		case "Gerar Relatorio":
			TabelaAtrasos tabela = new TabelaAtrasos(emprestimosAtrasados());
			tela.jTable1.setModel(tabela);
			break;
		}
	}
}
