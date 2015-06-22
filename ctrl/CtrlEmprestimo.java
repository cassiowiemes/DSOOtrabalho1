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
        this.tela = new TelaEmprestimo(this);
    }

    public void iniciar() {
    	tela.setVisible(true);
    }
    
    public ArrayList<EmprestimoWrapper> emprestimosAtrasados(){
    	Collection<Emprestimo> emprestimos = mapeador.getValues();
    	ArrayList<EmprestimoWrapper> atrasos = new ArrayList<>();
    	for(Emprestimo emprestimo : emprestimos){
    		if(emprestimo.getDataPlanejadaDevolucao() < tela.getDadosEmprestimo()){
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
    	Emprestimo emprestimo = new Emprestimo(ctrlPrincipal.getUsuario(codigoUsuario),
    			ctrlPrincipal.getExemplar(codigoExemplar));
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
    
   
	public void realizaAcao(String command) {
		EmprestimoWrapper e;
		switch(command){
		case "Registrar novo emprestimo":
			e = tela.getDadosEmprestimo();
			try
			{
				efetuaEmprestimo(e.codigoUsuario, e.codigoExemplar, e.dataPlanejadaDevolucao);
			} catch (Exception e1)
			{
				// TODO
				e1.printStackTrace();
			}
	    	//tela.setVisible(false);
			break;
			
		case "Registrar devolução":
	    	//tela.setVisible(false);
			e = tela.getDadosDevolucao();
			try
			{
				efetuaDevolucao(e.codigoExemplar, e.dataDevolucao);
			} catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Voltar":
	    	tela.setVisible(false);
	    	ctrlPrincipal.iniciar();
			break;
		case "Efetua emprestimo":
			//tela.setVisible(false);
			//ctrlPrincipal.iniciar();
			break;
		}
	}
}
