package model;

import java.util.HashSet;

public class Turma {
	private Integer id;
	private HashSet<Aluno> alunos;
	private Professor professor;
	
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
