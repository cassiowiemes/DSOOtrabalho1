package ctrl;
import model.Aluno;
import model.Professor;
import model.Usuario;
import view.TelaUsuario;
import utils.MapeadorAluno;
import utils.MapeadorProfessor;
import utils.UserWrapper;

public class CtrlUsuario {
	private MapeadorAluno mapeadorAluno;
	private MapeadorProfessor mapeadorProfessor;
    private CtrlPrincipal ctrl;
    private CtrlTurmaDisciplina ctrlTurmaDisciplina;
    private TelaUsuario tela;

    public CtrlUsuario(CtrlPrincipal ctrl) {
        this.ctrl = ctrl;
        this.tela = new TelaUsuario(this);
        mapeadorAluno = new MapeadorAluno();
        mapeadorProfessor = new MapeadorProfessor();
    }

    public void iniciar() {
    	tela.setVisible(true);
    }

	public void realizaAcao(int command) {
		switch(command){
			case 11://salvar emprestimo
				// TODO
				break;
			case 13://voltar emprestimo
		    	tela.setVisible(false);
		    	ctrl.iniciar();
				break;
			case 21://salvar devolucao
				// TODO
				break;
			case 23://voltar devolucao
		    	tela.setVisible(false);
		    	ctrl.iniciar();
				break;
		}
	}
	
	public void registraProfessor(UserWrapper user){
		Professor professor = new Professor(user.nome, user.idade, user.endereco, user.pai, user.mae);
		ctrlTurmaDisciplina.addProfessor(professor, user.disciplina);
		ctrlTurmaDisciplina.setProfessor(professor, user.turma);
		mapeadorProfessor.put(professor);
	}
	
	public void registraAluno(UserWrapper user){
		Aluno aluno = new Aluno(user.nome, user.idade, user.endereco, user.pai, user.mae);
		ctrlTurmaDisciplina.addAluno(aluno, user.turma);
		mapeadorAluno.put(aluno);
	}
    
    public Usuario getUsuario(Integer id){
    	Usuario usuario = mapeadorAluno.get(id);
    	if(usuario == null){
    		usuario = mapeadorProfessor.get(id);
    	}
    	return usuario;
    }
}
