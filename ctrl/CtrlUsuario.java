package ctrl;
import model.Aluno;
import model.Professor;
import model.Usuario;
import view.TelaUsuario;
import utils.ChaveInvalidaException;
import utils.Mapeador;
import utils.UserWrapper;

public class CtrlUsuario {
	private Mapeador<Aluno> mapeadorAluno;
	private Mapeador<Professor> mapeadorProfessor;
    private CtrlPrincipal ctrl;
    private CtrlTurmaDisciplina ctrlTurmaDisciplina;
    private TelaUsuario tela;

    public CtrlUsuario(CtrlPrincipal ctrl) {
        this.ctrl = ctrl;
        this.tela = new TelaUsuario(this);
        this.ctrlTurmaDisciplina = new CtrlTurmaDisciplina();
        mapeadorAluno = new Mapeador<>("alunos.txt");
        mapeadorProfessor = new Mapeador<>("professores.txt");
        Integer ultimaId = Math.max(mapeadorAluno.getHighestKey(), mapeadorProfessor.getHighestKey());
        mapeadorAluno.setLastId(ultimaId);
        mapeadorProfessor.setLastId(ultimaId);
    }

    public void iniciar() {
    	tela.setVisible(true);
    }

	public void realizaAcao(String command) {
		switch(command){
			case "Salvar Professor":
				registraProfessor(tela.getDadosProfessor());
				break;
			case "Salvar Aluno":
				registraAluno(tela.getDadosAluno());
				break;
			case "Voltar":
		    	tela.setVisible(false);
		    	ctrl.iniciar();
				break;
		}
	}
	
	public void registraProfessor(UserWrapper user){
		Professor professor = new Professor(user.nome, user.idade, user.endereco, user.pai, user.mae);
		ctrlTurmaDisciplina.addProfessor(professor, user.disciplina);
		ctrlTurmaDisciplina.setProfessor(professor, user.turma);
		mapeadorProfessor.incrementId();
		mapeadorAluno.incrementId();
		professor.setId(mapeadorProfessor.getId());
		mapeadorProfessor.put(professor.getId(), professor);
		tela.sucessoCriar(professor.getId());
	}
	
	public void registraAluno(UserWrapper user){
		Aluno aluno = new Aluno(user.nome, user.idade, user.endereco, user.pai, user.mae);
		ctrlTurmaDisciplina.addAluno(aluno, user.turma);
		mapeadorProfessor.incrementId();
		mapeadorAluno.incrementId();
		aluno.setId(mapeadorAluno.getId());
		mapeadorAluno.put(aluno.getId(), aluno);
		tela.sucessoCriar(aluno.getId());
	}
    
    public Usuario getUsuario(Integer id) throws ChaveInvalidaException{
    	Usuario usuario;
    	if(mapeadorAluno.get(id) != null) return mapeadorAluno.get(id);
    	if(mapeadorProfessor.get(id) != null) return mapeadorProfessor.get(id);
    	throw new ChaveInvalidaException();
    }
}
