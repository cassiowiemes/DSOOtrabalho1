package ctrl;
import java.util.ArrayList;
import java.util.Collection;

import utils.EmprestimoWrapper;
import utils.MapeadorEmprestimo;
import model.Emprestimo;
import view.TelaEmprestimo;

public class CtrlEmprestimo {

    private CtrlPrincipal ctrlPrincipal;
    private MapeadorEmprestimo mapeador;
    private TelaEmprestimo tela;

    public CtrlEmprestimo(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.tela = new TelaEmprestimo();
    }

    public void iniciar() {
    	tela.setVisible(true);
    }
    
    public ArrayList<EmprestimoWrapper> emprestimosAtrasados(){
    	Collection<Emprestimo> emprestimos = mapeador.getValues();
    	ArrayList<EmprestimoWrapper> atrasos = new ArrayList<>();
    	for(Emprestimo emprestimo : emprestimos){
    		if(emprestimo.getDataPlanejadaDevolucao() < tela.getData()){
    			//seria boa prática passar para o wrapper o objeto que ele representa?
    			//desse modo, ele setaria seus campos.
    			//aumenta a reutilização de código. aumenta acoplamento?
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
    
    public void efetuaEmprestimo(Integer codigoUsuario, Integer codigoExemplar) throws Exception{
    	Emprestimo emprestimo = new Emprestimo(ctrlPrincipal.getUsuario(codigoUsuario),
    			ctrlPrincipal.getExemplar(codigoExemplar));
    	if(!emprestimo.isUsuarioDisponivel());// throw UsuarioIndisponivelException;
    	if(!emprestimo.isExemplarDisponivel());// throw ExemplarIndisponivelException;
    	emprestimo.efetuaEmprestimo(tela.getData());
    	mapeador.put(emprestimo);
    }
    
    public void efetuaDevolucao(Integer codigoEmprestimo, int dataDevolucao) throws Exception {
    	Emprestimo emprestimo = mapeador.get(codigoEmprestimo);
    	if(emprestimo == null) {};// throw EmprestimoInexistenteException;
    	if(emprestimo.getDataPlanejadaDevolucao() < tela.getData()){
    		tela.mostraMulta(emprestimo.getMulta(tela.getData()));
    	}
    	emprestimo.efetuaDevolucao(dataDevolucao);
    }
    
    
	public void realizaAcao(String command) {
		switch(command){
		case "btRegistraEmprestimo":
	    	tela.setVisible(false);
			//ctrlUsuario.iniciar();
			break;
		case "btRegistraDevolucao":
	    	tela.setVisible(false);
			//ctrlItem.iniciar();
			break;
		case "btVoltarbtVoltar":
	    	tela.setVisible(false);
			//ctrlEmprestimo.iniciar();
			break;
		}
	}
}
