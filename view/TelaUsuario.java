
import java.util.Scanner;

public class TelaUsuario {

    Scanner sc;

    public TelaUsuario() {
        sc = new Scanner(System.in);
    }

    public int iniciar() {
        System.out.println("--------------------------------");
        System.out.println("SELECIONE A OPÇÃO DESEJADA:");
        System.out.println("1: Cadastrar novo aluno.");
        System.out.println("2: Cadastrar novo professor.");
        System.out.println("3: Sair.");
        return sc.nextInt();
    }

    public void entradaInvalida() {
        System.out.println("Entrada invalida!");
    }

    public void sair() {
        System.out.println("Retornando ao menu principal...");
    }

    public void cadastraAluno() {
        System.out.println("--------------------------------");
        System.out.println("CADASTRO ALUNO:");
    }

    public void alunoCadastrado(int codigo) {
        System.out.println("Aluno cadastrado com sucesso. Codigo: " + codigo);
    }

    public void cadastraProfessor() {
        System.out.println("--------------------------------");
        System.out.println("CADASTRO PROFESSOR:");
    }

    public void professorCadastrado(int codigo) {
        System.out.println("Professor cadastrado com sucesso. Codigo: "
                + codigo);
    }

    public void removeAluno() {
        System.out.println("--------------------------------");
        System.out.println("REMOÇÃO DE ALUNO:");
    }

    public void alunoRemovido() {
        System.out.println("Aluno removido com sucesso.");
    }

    public void removeProfessor() {
        System.out.println("--------------------------------");
        System.out.println("REMOÇÃO DE PROFESSOR:");
    }

    public void professorRemovido() {
        System.out.println("Professor removido com sucesso.");
    }

    public String getNome() {
        System.out.print("\nDigite o nome do usuário: ");
        //return sc.nextLine();
        return ("José");
    }

    public int getIdade() {
        System.out.print("\nDigite a idade do usuário: ");
        //return sc.nextInt();
        return 13;
    }

    public String getEndereco() {
        System.out.print("\nDigite o endereço do usuário: ");
        //return sc.nextLine();
        return ("Rua da joca puta");
    }

    public String getNomePai() {
        System.out.print("\nDigite o nome do pai do usuário: ");
        //return sc.nextLine();
        return ("Jair");
    }

    public String getNomeMae() {
        System.out.print("\nDigite o nome da mãe do usuário: ");
        //return sc.nextLine();
        return ("Jaci");
    }

    public String getTurmaAluno() {
        System.out.print("\nDigite o nome da turma ao qual o aluno pertence: ");
        //return sc.nextLine();
        return ("102");
    }

    public int getUsuario() {
        System.out.println("Digite o código do usuário: ");
        //return sc.nextInt();
        return 1;
    }
}
