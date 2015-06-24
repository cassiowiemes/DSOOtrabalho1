package ctrl;
import java.util.ArrayList;
import java.util.Collection;

import utils.EmprestimoWrapper;
import utils.MapeadorEmprestimo;
import utils.ValorNuloException;
import model.Emprestimo;
import view.TelaEmprestimo;

public class CtrlEmprestimo {

    private CtrlPrincipal ctrl;
    private MapeadorEmprestimo mapeador;
    private TelaEmprestimo tela;
    private final int DATA_ATUAL = 27;

    public CtrlEmprestimo(CtrlPrincipal ctrl) {
        this.ctrl = ctrl;
        this.tela = new TelaEmprestimo(this);
        mapeador = new MapeadorEmprestimo();
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
    		int dataEmprestimo) {
    	Emprestimo emprestimo = new Emprestimo(ctrl.getUsuario(codigoUsuario),
    			ctrl.getExemplar(codigoExemplar));
    	try{
	    	if(emprestimo.isUsuarioDisponivel() && emprestimo.isExemplarDisponivel()){
	    		emprestimo.efetuaEmprestimo(dataEmprestimo);
	    		mapeador.put(emprestimo);
	    	}
    	}catch(NullPointerException e){
    		tela.campoInvalido(); // TODO separar exceções de exemplar e usuário inválidos
    	}
    }
    
    public void efetuaDevolucao(Integer codigoEmprestimo, int dataDevolucao) {
    	Emprestimo emprestimo = mapeador.get(codigoEmprestimo);
    	if(emprestimo != null) {
    		if(emprestimo.getDataPlanejadaDevolucao() < dataDevolucao){
    			tela.mostraMulta(emprestimo.getMulta(dataDevolucao));
    		}
    		emprestimo.efetuaDevolucao(dataDevolucao);
    	}
    }
   
	public void realizaAcao(String command) {
		EmprestimoWrapper emprestimo = new EmprestimoWrapper();
		switch(command){
		case "Salvar Emprestimo":
			// TODO tratar possíveis exceções
			efetuaEmprestimo(emprestimo.codigoUsuario, emprestimo.codigoExemplar,
					emprestimo.dataEmprestimo);
			break;
		case "Salvar Devolucao":
			// TODO tratar possíveis exceções
			efetuaDevolucao(emprestimo.id, emprestimo.dataDevolucao);
			break;
		case "Voltar":
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		case "Gerar Relatorio":
			// TODO implementar gerar relatorio
			// implementar table model para popular tabela
			break;
		}
	}
}
