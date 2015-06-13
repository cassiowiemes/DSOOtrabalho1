package ctrl;
import java.awt.GridLayout;

import model.*;
import view.*;

import javax.swing.*;
public class CtrlPrincipal {

    private CtrlItem ctrlItem;
    private CtrlEmprestimo ctrlEmprestimo;
    private CtrlUsuario ctrlUsuario;
    private JFrame mainFrame;
    private JFrame secondFrame;
    private TelaPrincipal tela;

    public CtrlPrincipal() {
        ctrlItem = new CtrlItem(this);
        ctrlEmprestimo = new CtrlEmprestimo(this, 18);
        //18 fica como substituto para o dia atual que seria obtido usando java Date
        ctrlUsuario = new CtrlUsuario(this);
        mainFrame = new JFrame();
        secondFrame = new JFrame();
        tela = new TelaPrincipal(this);
    }

    public void iniciar() {
    	configFrame(mainFrame, "Biblioteca Central.", tela);
    	mainFrame.setSize(400, 350);
    	secondFrame.setSize(600, 300);
    }

	public void realizaAcao(String command) {
		switch(command){
		case "Aluno":
			configFrame(secondFrame, "Registro de alunos", ctrlUsuario.getTela());
			break;
		case "Professor":
			configFrame(secondFrame, "Registro de professores", ctrlUsuario.getTela());
			break;
		case "Livro":
			configFrame(secondFrame, "Registro de livros", ctrlItem.getTela());
			break;
		case "Revista":
			configFrame(secondFrame, "Registro de revistas", ctrlItem.getTela());
			break;
		case "Exemplar":
			configFrame(secondFrame, "Registro de exemplares", ctrlItem.getTela());
			break;
		case "Relatorio":
			configFrame(secondFrame, "Relatório de empréstimos em atraso", ctrlEmprestimo.getTelaRelatorio());
			break;
		case "Emprestimo":
			configFrame(secondFrame, "Registro de empréstimos", ctrlEmprestimo.getTelaEmprestimo());
			break;
		case "Devolucao":
			configFrame(secondFrame, "Registro de devoluções", ctrlEmprestimo.getTelaDevolucao());
			break;
		}
	}
	private void configFrame(JFrame frame, String titulo, JPanel panel){
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(titulo);
    	frame.setVisible(true);
    	frame.setContentPane(panel);
		frame.setLayout(new GridLayout(0,2));
	}

	public void hideSecondFrame() {
		secondFrame.setVisible(false);		
	}
	
}

/*public void setTela(JPanel tela){
frame.getContentPane().removeAll();
frame.setContentPane(tela);
frame.repaint();
frame.printAll(frame.getGraphics());
}*/