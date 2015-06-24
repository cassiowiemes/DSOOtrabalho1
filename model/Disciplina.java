package model;

import java.io.Serializable;
import java.util.HashSet;

public class Disciplina  implements Serializable {
    private static final long serialVersionUID = 1L;
    
	private Integer id;
	private String nome;
	private HashSet<Professor> professores;
	
	public Disciplina(){
		professores = new HashSet<>();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public HashSet<Professor> getProfessor() {
		return professores;
	}
	public void addProfessor(Professor professor) {
		professores.add(professor);
	}
}
