package ctrl;
import model.*;
import view.*;
import java.util.HashSet;

public class CtrlUsuario {

    private HashSet<IUsuario> usuarios;
    private CtrlPrincipal ctrlPrincipal;
    private TelaUsuario telaUsuario;

    public CtrlUsuario(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.usuarios = new HashSet<>();
        this.telaUsuario = new TelaUsuario();
    }

    public void iniciar() {
        int opcao = 0;
        do {
            opcao = telaUsuario.iniciar();
            switch (opcao) {
                case 1:
                    cadastraAluno();
                    break;
                case 2:
                    cadastraProfessor();
                    break;
                case 3:
                    telaUsuario.sair();
                    return;
                default:
                    telaUsuario.entradaInvalida();
            }
        } while (opcao != 3);
    }

    public void cadastraAluno() {
        telaUsuario.cadastraAluno();
        String nome = telaUsuario.getNome();
        int idade = telaUsuario.getIdade();
        String endereco = telaUsuario.getEndereco();
        String nomePai = telaUsuario.getNomePai();
        String nomeMae = telaUsuario.getNomeMae();
        String turma = telaUsuario.getTurmaAluno();
        Aluno aluno = new Aluno(nome, idade, endereco, nomePai, nomeMae, turma);
        usuarios.add(aluno);
        telaUsuario.alunoCadastrado(aluno.getCodigo());
    }

    public void cadastraProfessor() {
        telaUsuario.cadastraProfessor();
        String nome = telaUsuario.getNome();
        int idade = telaUsuario.getIdade();
        String endereco = telaUsuario.getEndereco();
        String nomePai = telaUsuario.getNomePai();
        String nomeMae = telaUsuario.getNomeMae();
        Professor professor = new Professor(nome, idade, endereco, nomePai, nomeMae);
        usuarios.add(professor);
        telaUsuario.professorCadastrado(professor.getCodigo());
    }

    public IUsuario getUsuario() {
        do {
            int codigo = telaUsuario.getUsuario();
            for (IUsuario usuario : usuarios) {
                if (usuario.getCodigo() == codigo) {
                    return usuario;
                }
            }
            telaUsuario.entradaInvalida();
        } while (true);
    }
}
