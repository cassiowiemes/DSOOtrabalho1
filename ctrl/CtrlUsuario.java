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
    private CtrlPrincipal ctrlPrincipal;
    private CtrlTurmaDisciplina ctrlTurmaDisciplina;
    private TelaUsuario tela;

    public CtrlUsuario(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.tela = new TelaUsuario(this);
        mapeadorAluno = new MapeadorAluno();
        mapeadorProfessor = new MapeadorProfessor();
    }

    public void iniciar() {
    	tela.setVisible(true);
    }

	public void realizaAcao(String command) {
		
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
