package ctrl;
import model.IExemplar;
import model.IUsuario;
import utils.ChaveInvalidaException;
import view.TelaPrincipal;

public class CtrlPrincipal {

    private CtrlItem ctrlItem;
    private CtrlEmprestimo ctrlEmprestimo;
    private CtrlUsuario ctrlUsuario;
    private TelaPrincipal tela;

    public CtrlPrincipal() {
        ctrlItem = new CtrlItem(this);
        ctrlEmprestimo = new CtrlEmprestimo(this);
        ctrlUsuario = new CtrlUsuario(this);
        tela = new TelaPrincipal(this);
    }

    public void iniciar() {
    	tela.setVisible(true);
    }

	public void realizaAcao(int command) {
		switch(command){
		case 1:
	    	tela.setVisible(false);
			ctrlEmprestimo.iniciar();
			break;
		case 2:
	    	tela.setVisible(false);
			ctrlUsuario.iniciar();
			break;
		case 3:
	    	tela.setVisible(false);
			ctrlItem.iniciar();
			break;
		}
	}

	public IUsuario getUsuario(int codigo) throws ChaveInvalidaException {
		return ctrlUsuario.getUsuario(codigo);
	}

	public IExemplar getExemplar(int codigo) {
		return ctrlItem.getExemplar(codigo);
	}
}