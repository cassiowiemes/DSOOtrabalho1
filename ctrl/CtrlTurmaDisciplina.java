package ctrl;
import utils.Mapeador;
import model.Aluno;
import model.Professor;
import model.Turma;
import model.Disciplina;

public class CtrlTurmaDisciplina {
	private Mapeador<Turma> mapeadorTurma;
	private Mapeador<Disciplina> mapeadorDisciplina;
	
	public CtrlTurmaDisciplina (){
		mapeadorDisciplina = new Mapeador<>("disciplinas.txt");
		mapeadorTurma = new Mapeador<>("turmas.txt");
        Integer ultimaId = Math.max(mapeadorDisciplina.getHighestKey(), mapeadorTurma.getHighestKey());
        mapeadorDisciplina.setLastId(ultimaId);
        mapeadorTurma.setLastId(ultimaId);
	}
	public void setProfessor(Professor professor, Integer codigoTurma){
		Turma turma = mapeadorTurma.get(codigoTurma);
		if(turma == null){
			turma = new Turma();
			mapeadorTurma.incrementId();
			turma.setId(mapeadorTurma.getId());
			mapeadorTurma.put(turma.getId(), turma);
		}
		turma.setProfessor(professor);
	}
	public void addAluno(Aluno aluno, Integer codigoTurma){
		Turma turma = mapeadorTurma.get(codigoTurma);
		if(turma == null){
			turma = new Turma();
			mapeadorTurma.incrementId();
			turma.setId(mapeadorTurma.getId());
			mapeadorTurma.put(turma.getId(), turma);
		}
		turma.addAluno(aluno);
	}
	public void addProfessor(Professor professor, Integer codigoDisciplina){
		Disciplina disciplina = mapeadorDisciplina.get(codigoDisciplina);
		if(disciplina == null){
			disciplina = new Disciplina();
			mapeadorDisciplina.incrementId();
			disciplina.setId(mapeadorTurma.getId());
			mapeadorDisciplina.put(disciplina.getId(), disciplina);
		}
		disciplina.addProfessor(professor);
	}
}
