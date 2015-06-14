package ctrl;
import utils.MapeadorDisciplina;
import utils.MapeadorTurma;
import model.Aluno;
import model.Professor;
import model.Turma;
import model.Disciplina;

public class CtrlTurmaDisciplina {
	private MapeadorTurma mapeadorTurma;
	private MapeadorDisciplina mapeadorDisciplina;
	
	public CtrlTurmaDisciplina (){
		mapeadorDisciplina = new MapeadorDisciplina();
		mapeadorTurma = new MapeadorTurma();
	}
	public void setProfessor(Professor professor, Integer codigoTurma){
		Turma turma = mapeadorTurma.get(codigoTurma);
		if(turma == null){
			turma = new Turma();
		}
		turma.setProfessor(professor);
	}
	public void addAluno(Aluno aluno, Integer codigoTurma){
		Turma turma = mapeadorTurma.get(codigoTurma);
		if(turma == null){
			turma = new Turma();
		}
		turma.addAluno(aluno);
	}
	public void addProfessor(Professor professor, Integer codigoDisciplina){
		Disciplina disciplina = mapeadorDisciplina.get(codigoDisciplina);
		if(disciplina == null){
			disciplina = new Disciplina();
		}
		disciplina.addProfessor(professor);
	}
}
