package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ctrl.CtrlEmprestimo;

public class TelaEmprestimo extends JFrame {

	JButton btRegistraEmprestimo;
	JButton btRegistraDevolucao;
	JButton btVoltar;
	CtrlEmprestimo ctrlEmprestimo;
	
	public TelaEmprestimo(CtrlEmprestimo ctrlEmp){
		this.ctrlEmprestimo = ctrlEmp;
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Gerenciamento de empr�stimos!");
		setLayout(new FlowLayout());
		setSize(400, 350);

//		//buttons
		ButtonManager btMan = new ButtonManager();
		btRegistraEmprestimo = new JButton();
		btRegistraEmprestimo.setText("Registrar novo emprestimo");
		btRegistraEmprestimo.addActionListener(btMan);
		btRegistraDevolucao = new JButton();
		btRegistraDevolucao.setText("Registrar devolu��o");
		btRegistraDevolucao.addActionListener(btMan);
		btVoltar = new JButton();
		btVoltar.setText("Voltar");
		btVoltar.addActionListener(btMan);
		
		//add items

		add(btRegistraEmprestimo);
		add(btRegistraDevolucao);
		add(btVoltar);
	}

	public void mostraMulta(float multa) {
		// TODO Auto-generated method stub
		
	}

	public int getData() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private class ButtonManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ctrlEmprestimo.realizaAcao(ae.getActionCommand());
        }
    }

//    Scanner sc;
//    public TelaEmprestimo() {
//        sc = new Scanner(System.in);
//    }
//
//    public int getCodigoUsuario() {
//        System.out.println("Digite o código do usuário:");
//        //return sc.nextInt();
//        return 1;
//    }
//
//    public int getCodigoExemplar() {
//        System.out.println("Digite o código do exemplar:");
//        //return sc.nextInt();
//        return 1;
//    }
//
//    public int getDataEmprestimo() {
//        System.out.println("Digite a data do empréstimo:");
//        //return sc.nextInt();
//        return 15;
//    }
//
//    public int getCodigoEmprestimo() {
//        System.out.println("Digite o código do empréstimo:");
//        return sc.nextInt();
//    }
//
//    public int iniciar() {
//        System.out.println("--------------------------------");
//        System.out.println("SELECIONE A OPÇÃO DESEJADA:");
//        System.out.println("1: Registrar novo empréstimo.");
//        System.out.println("2: Registrar devolução.");
//        System.out.println("3: Gerar relatório de atrasos.");
//        System.out.println("4: Sair.");
//        return sc.nextInt();
//    }
//
//    public void entradaInvalida() {
//        System.out.println("Entrada invalida!");
//    }
//
//    public void iniciaEmprestimo() {
//        System.out.println("--------------------------------");
//        System.out.println("CADASTRO DE EMPRÉSTIMOS:");
//    }
//
//    public void exibeMulta(float multa) {
//        if (multa > 0) {
//            System.out.println("Empréstimo em atraso. Valor à pagar: " + multa);
//        } else {
//            System.out.println("Sem multa para pagar.");
//        }
//    }
//
//    public void iniciaDevolucao() {
//        System.out.println("--------------------------------");
//        System.out.println("DEVOLUÇÕES:");
//    }
//
//    public void finalizaDevolucao() {
//        System.out.println("Devolução efetuada com sucesso.");
//    }
//
//    public void sair() {
//        System.out.println("Retornando ao menu principal...");
//    }
//
//    public void imprimeRelatorio(ArrayList<String> usuarios, ArrayList<String> titulos, ArrayList<Integer> codigos) {
//        System.out.println("--------------------------------");
//        System.out.println("RELATÓRIO DE ATRASOS:");
//        System.out.println("Nome do usuario - Código do exemplar");
//        for (int i = 0; i < usuarios.size(); ++i) {
//            System.out.format("%32s%32s%10d", usuarios.get(i), titulos.get(i), codigos.get(i));
//        }
//        System.out.println("--------------------------------");
//    }
//
//    public void usuarioIndisponivel() {
//        System.out.println("Usuário atingiu o limite de empréstimos simultâneos.");
//    }
//
//    public void exemplarIndisponivel() {
//        System.out.println("Exemplar encontra-se indisponível no momento.");
//    }
//
//    public void finalizaEmprestimo(int codigo) {
//        System.out.println("Empréstimo efetuado com sucesso. Código: " + codigo);
//    }
}
