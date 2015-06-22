package ctrl;
import model.IExemplar;
import model.IUsuario;
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
        // código incluído para exibir telas, SOMENTE DURANTE DESENVOLVIMENTO!
		ctrlUsuario.iniciar();		//alterar valor inicial dos itens
		ctrlItem.iniciar();			//criar elementos do combo box
		ctrlEmprestimo.iniciar();	//tela bugada: abrir para ver!
		// TODO ver como desabilitar botão fechar nas telas além da principal!
		// FIM DO CÓDIGO!!!
    }

    public void iniciar() {
    	tela.setVisible(true);
    }

	public void realizaAcao(String command) {
		switch(command){
		case "Usuario":
	    	tela.setVisible(false);
			ctrlUsuario.iniciar();
			break;
		case "Item":
	    	tela.setVisible(false);
			ctrlItem.iniciar();
			break;
		case "Emprestimo":
	    	tela.setVisible(false);
			ctrlEmprestimo.iniciar();
			break;
		}
	}

	public IUsuario getUsuario(int codigo) {
		return ctrlUsuario.getUsuario(codigo);
	}

	public IExemplar getExemplar(int codigo) {
		return ctrlItem.getExemplar(codigo);
	}
}