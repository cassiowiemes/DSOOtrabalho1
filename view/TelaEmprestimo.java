package view;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaEmprestimo extends JPanel {

	JLabel lbUsuario;
	JTextField tbusuario;
	JButton btBuscarUsuario;
	JLabel lbNome;
	JTextField tbNome;
	JLabel lbExemplar;
	JTextField tbExemplar;
	JButton btBuscarExemplar;
	JLabel lbTitulo;
	JTextField tbTitulo;
	JLabel lbDataDev;
	JTextField tbDataDev;
	JButton btSalvar;
	JButton btCancelar;
	
	public TelaEmprestimo(){
		//labels
		lbUsuario = new JLabel();
		lbUsuario.setText("C�digo do usu�rio:");
		lbNome = new JLabel();
		lbNome.setText("Nome do usu�rio:");
		lbExemplar = new JLabel();
		lbExemplar.setText("C�digo go exemplar:");
		lbTitulo = new JLabel();
		lbTitulo.setText("T�tulo do item:");
		lbDataDev = new JLabel();
		lbDataDev.setText("Data para devolu��o:");
		//text fields
		tbusuario = new JTextField();
		tbNome = new JTextField();
		tbExemplar = new JTextField();
		tbTitulo = new JTextField();
		tbDataDev = new JTextField();
		//buttons
		btBuscarUsuario = new JButton();
		btBuscarExemplar = new JButton();
		btSalvar = new JButton();
		btCancelar = new JButton();
		//add items
		add(lbUsuario);
		add(tbusuario);
		add(btBuscarUsuario);
		add(lbNome);
		add(tbNome);
		add(lbExemplar);
		add(tbExemplar);
		add(btBuscarExemplar);
		add(lbTitulo);
		add(tbTitulo);
		add(lbDataDev);
		add(tbDataDev);
		add(btSalvar);
		add(btCancelar);
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
