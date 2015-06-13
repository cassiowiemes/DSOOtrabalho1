package view;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.*;
import ctrl.CtrlUsuario;

import javax.swing.*;


public class TelaUsuario extends JPanel {

    //Scanner sc;
	CtrlUsuario ctrl;
	JLabel lbNome = new JLabel();
	JTextField tbNome;
	JLabel lbIdade = new JLabel();
	JTextField tbIdade;
	JLabel lbMae = new JLabel();
	JTextField tbMae;
	JLabel lbPai = new JLabel();
	JTextField tbPai;
	JLabel lbEndereco = new JLabel();
	JTextField tbEndereco;
	JLabel lbTurma = new JLabel();
	JTextField tbTurma;
	JButton btSalvar = new JButton();
	JButton btCancelar = new JButton();

    public TelaUsuario(CtrlUsuario ctrl) {
        //sc = new Scanner(System.in);
    	this.ctrl = ctrl;
    	setLayout(new GridLayout(0,2));
    	//labels
    	lbNome.setText("Nome:");
    	lbIdade.setText("Idade:");
    	lbMae.setText("Nome da m�e:");
    	lbPai.setText("Nome do pai:");
    	lbEndereco.setText("Endere�o:");
    	lbTurma.setText("Turma:");
    	
    	//text fields
    	tbNome = new JTextField();
    	tbIdade = new JTextField();
    	tbMae = new JTextField();
    	tbPai = new JTextField();
    	tbEndereco = new JTextField();
    	tbTurma = new JTextField();
    	
    	//buttons
		ButtonManager btMan = new ButtonManager();
		btSalvar = new JButton();
		btSalvar.setText("Salvar");
		btSalvar.addActionListener(btMan);
		btCancelar = new JButton();
		btCancelar.setText("Cancelar");
		btCancelar.addActionListener(btMan);
		
		//adding items
		add(lbNome);
		add(tbNome);
		add(lbIdade);
		add(tbIdade);
		add(lbMae);
		add(tbMae);
		add(lbPai);
		add(tbPai);
		add(lbEndereco);
		add(tbEndereco);
		add(lbTurma);
		add(tbTurma);
		add(btSalvar);
		add(btCancelar);
    }
	
	private class ButtonManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ctrl.realizaAcao(ae.getActionCommand());
        }
    }

	public void limparCampos() {
    	tbNome.setText(null);
    	tbIdade.setText(null);
    	tbMae.setText(null);
    	tbPai.setText(null);
    	tbEndereco.setText(null);
    	tbTurma.setText(null);
	}

	public UserWrapper GetDados() {
		UserWrapper user = new UserWrapper();
		user.nome = tbNome.getText();
		user.idade = Integer.parseInt(tbIdade.getText());
		user.mae = tbMae.getText();
		user.pai = tbPai.getText();
		user.endereco = tbEndereco.getText();
		user.turma = tbTurma.getText();
		return user;
	}

	public void sucessoCriar() {
		JOptionPane.showMessageDialog(null, "Cria��o efetuada com sucesso", "Criar usu�rio", 1);
	}

//    public int iniciar() {
//        System.out.println("--------------------------------");
//        System.out.println("SELECIONE A OPÇÃO DESEJADA:");
//        System.out.println("1: Cadastrar novo aluno.");
//        System.out.println("2: Cadastrar novo professor.");
//        System.out.println("3: Sair.");
//        return sc.nextInt();
//    }
//
//    public void entradaInvalida() {
//        System.out.println("Entrada invalida!");
//    }
//
//    public void sair() {
//        System.out.println("Retornando ao menu principal...");
//    }
//
//    public void cadastraAluno() {
//        System.out.println("--------------------------------");
//        System.out.println("CADASTRO ALUNO:");
//    }
//
//    public void alunoCadastrado(int codigo) {
//        System.out.println("Aluno cadastrado com sucesso. Codigo: " + codigo);
//    }
//
//    public void cadastraProfessor() {
//        System.out.println("--------------------------------");
//        System.out.println("CADASTRO PROFESSOR:");
//    }
//
//    public void professorCadastrado(int codigo) {
//        System.out.println("Professor cadastrado com sucesso. Codigo: "
//                + codigo);
//    }
//
//    public void removeAluno() {
//        System.out.println("--------------------------------");
//        System.out.println("REMOÇÃO DE ALUNO:");
//    }
//
//    public void alunoRemovido() {
//        System.out.println("Aluno removido com sucesso.");
//    }
//
//    public void removeProfessor() {
//        System.out.println("--------------------------------");
//        System.out.println("REMOÇÃO DE PROFESSOR:");
//    }
//
//    public void professorRemovido() {
//        System.out.println("Professor removido com sucesso.");
//    }
//
//    public String getNome() {
//        System.out.print("\nDigite o nome do usuário: ");
//        //return sc.nextLine();
//        return ("José");
//    }
//
//    public int getIdade() {
//        System.out.print("\nDigite a idade do usuário: ");
//        //return sc.nextInt();
//        return 13;
//    }
//
//    public String getEndereco() {
//        System.out.print("\nDigite o endereço do usuário: ");
//        //return sc.nextLine();
//        return ("Rua da joca puta");
//    }
//
//    public String getNomePai() {
//        System.out.print("\nDigite o nome do pai do usuário: ");
//        //return sc.nextLine();
//        return ("Jair");
//    }
//
//    public String getNomeMae() {
//        System.out.print("\nDigite o nome da mãe do usuário: ");
//        //return sc.nextLine();
//        return ("Jaci");
//    }
//
//    public String getTurmaAluno() {
//        System.out.print("\nDigite o nome da turma ao qual o aluno pertence: ");
//        //return sc.nextLine();
//        return ("102");
//    }
//
//    public int getUsuario() {
//        System.out.println("Digite o código do usuário: ");
//        //return sc.nextInt();
//        return 1;
//    }
}
