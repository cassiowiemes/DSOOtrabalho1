package ctrl;
import model.*;
import view.*;

import java.util.HashSet;

import javax.swing.JPanel;

public class CtrlUsuario {
	
	MapeadorAluno mapeadorAluno = new MapeadorAluno();
	MapeadorProfessor mapeadorProfessor = new MapeadorProfessor();

   // private HashSet<IUsuario> usuarios;
    private CtrlPrincipal ctrlPrincipal;
    private TelaUsuario tela;

    public CtrlUsuario(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        //this.usuarios = new HashSet<>();
        this.tela = new TelaUsuario(this);
    }

    public void iniciar() {
    	
    }

	public void realizaAcao(String command) {
		UserWrapper user;
		switch(command){
		case "SalvarAluno":
			user = tela.GetDados();
			mapeadorAluno.put(new Aluno(user.nome, user.idade, user.endereco, user.pai, user.mae, user.turma));
			tela.sucessoCriar();
			tela.limparCampos();
			break;
		case "SalvarProfessor":
			user = tela.GetDados();
			mapeadorProfessor.put(new Professor(user.nome, user.idade, user.endereco, user.pai, user.mae));
			tela.sucessoCriar();
			tela.limparCampos();
			break;
		case "Cancelar":
			tela.limparCampos();
			ctrlPrincipal.hideSecondFrame();
			break;
		}
	}
	
    public JPanel getTela(){
    	return tela;
    }
//
//    public void iniciar() {
//        int opcao = 0;
//        do {
//            opcao = telaUsuario.iniciar();
//            switch (opcao) {
//                case 1:
//                    cadastraAluno();
//                    break;
//                case 2:
//                    cadastraProfessor();
//                    break;
//                case 3:
//                    telaUsuario.sair();
//                    return;
//                default:
//                    telaUsuario.entradaInvalida();
//            }
//        } while (opcao != 3);
//    }
//
//    public void cadastraAluno() {
//        telaUsuario.cadastraAluno();
//        String nome = telaUsuario.getNome();
//        int idade = telaUsuario.getIdade();
//        String endereco = telaUsuario.getEndereco();
//        String nomePai = telaUsuario.getNomePai();
//        String nomeMae = telaUsuario.getNomeMae();
//        String turma = telaUsuario.getTurmaAluno();
//        Aluno aluno = new Aluno(nome, idade, endereco, nomePai, nomeMae, turma);
//        usuarios.add(aluno);
//        telaUsuario.alunoCadastrado(aluno.getCodigo());
//    }
//
//    public void cadastraProfessor() {
//        telaUsuario.cadastraProfessor();
//        String nome = telaUsuario.getNome();
//        int idade = telaUsuario.getIdade();
//        String endereco = telaUsuario.getEndereco();
//        String nomePai = telaUsuario.getNomePai();
//        String nomeMae = telaUsuario.getNomeMae();
//        Professor professor = new Professor(nome, idade, endereco, nomePai, nomeMae);
//        usuarios.add(professor);
//        telaUsuario.professorCadastrado(professor.getCodigo());
//    }
//
//    public IUsuario getUsuario() {
//        do {
//            int codigo = telaUsuario.getUsuario();
//            for (IUsuario usuario : usuarios) {
//                if (usuario.getCodigo() == codigo) {
//                    return usuario;
//                }
//            }
//            telaUsuario.entradaInvalida();
//        } while (true);
//    }
}
