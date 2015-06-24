package model;

import java.io.Serializable;
import java.util.HashSet;

public class Turma  implements Serializable {
    private static final long serialVersionUID = 1L;
	private Integer id;
	private HashSet<Aluno> alunos;
	private Professor professor;
	
	public Turma(){
		alunos = new HashSet<>();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public HashSet<Aluno> getAlunos() {
		return alunos;
	}
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
