package view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ctrl.CtrlPrincipal;

public class TelaPrincipal extends JFrame{

	CtrlPrincipal ctrl;
	JButton btUsuario;
	JButton btItem;
	JButton btEmprestimo;
	
	public TelaPrincipal(CtrlPrincipal ctrl){
		this.ctrl = ctrl;
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Biblioteca Central!");
		setLayout(new FlowLayout());
		setSize(400, 350);
		
		//buttons
		ButtonManager btMan = new ButtonManager();
		btUsuario = new JButton();
		btUsuario.setText("Usuario");
		btUsuario.addActionListener(btMan);
		add(btUsuario);
		btItem = new JButton();
		btItem.setText("Item");
		btItem.addActionListener(btMan);
		add(btItem);
		btEmprestimo = new JButton();
		btEmprestimo.setText("Emprestimo");
		btEmprestimo.addActionListener(btMan);
		add(btEmprestimo);
	}
	
	private class ButtonManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ctrl.realizaAcao(ae.getActionCommand());
        }
    }
}
