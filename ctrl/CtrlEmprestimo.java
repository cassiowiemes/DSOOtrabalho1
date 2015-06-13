package ctrl;
import model.Emprestimo;
import view.TelaEmprestimo;
import javax.swing.*;


public class CtrlEmprestimo {

    private CtrlPrincipal ctrlPrincipal;
    private TelaEmprestimo tela;
    private int dataAtual;

    public CtrlEmprestimo(CtrlPrincipal ctrlPrincipal, int dataAtual) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.dataAtual = dataAtual;
        this.tela = new TelaEmprestimo();
    }

    public void iniciar() {
    	
    }

	public JPanel getTelaEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}

	public JPanel getTelaDevolucao() {
		return tela;
	}

	public JPanel getTelaRelatorio() {
		return tela;
	}
}
