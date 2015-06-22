package ctrl;
import java.util.ArrayList;
import java.util.Collection;

import utils.EmprestimoWrapper;
import utils.MapeadorEmprestimo;
import model.Emprestimo;
import view.TelaEmprestimo;

public class CtrlEmprestimo {

    private CtrlPrincipal ctrl;
    private MapeadorEmprestimo mapeador;
    private TelaEmprestimo tela;

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
    		if(/*emprestimo.getDataPlanejadaDevolucao() < tela.getDadosEmprestimo()*/ true){
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
    
    public void efetuaEmprestimo(Integer codigoUsuario, Integer codigoExemplar, Integer dtPlanDev) throws Exception{
    	Emprestimo emprestimo = new Emprestimo(ctrl.getUsuario(codigoUsuario),
    			ctrl.getExemplar(codigoExemplar));
    	if(!emprestimo.isUsuarioDisponivel());// throw UsuarioIndisponivelException;
    	if(!emprestimo.isExemplarDisponivel());// throw ExemplarIndisponivelException;
    	emprestimo.efetuaEmprestimo(dtPlanDev);
    	mapeador.put(emprestimo);
    }
    
    public void efetuaDevolucao(Integer codigoEmprestimo, int dataDevolucao) throws Exception {
    	Emprestimo emprestimo = mapeador.get(codigoEmprestimo);
    	if(emprestimo == null) {};// throw EmprestimoInexistenteException;
    	if(emprestimo.getDataPlanejadaDevolucao() < dataDevolucao){
    		tela.mostraMulta(emprestimo.getMulta(dataDevolucao));
    	}
    	emprestimo.efetuaDevolucao(dataDevolucao);
    }
   
	public void realizaAcao(int command) {
		EmprestimoWrapper e;
		switch(command){
		//salvar emprestimo
		case 11:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//limpar emprestimo
		case 12:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//voltar emprestimo
		case 13:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//salvar devolucao
		case 21:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//limpar devolucao
		case 22:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//voltar devolucao
		case 23:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//gerar relatorio
		case 31:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		}
	}
}
