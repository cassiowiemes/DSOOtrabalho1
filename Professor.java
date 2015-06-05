import java.util.HashSet;
import java.util.ArrayList;

public class Professor extends Usuario {

	private int finalPrazoDevolucao;
	private int finalNumeroEmprestimos;
	private HashSet<String> disciplinas;
	private String turma;

    public Professor(String nome, int idade, String endereco, String nomePai, String nomeMae){
        super(nome,idade,endereco,nomePai,nomeMae);
        super.setPrazoDevolucao(finalPrazoDevolucao);
        super.setPrazoDevolucao(finalNumeroEmprestimos);
    }
    
    public void addDisciplina(String disciplina){
        disciplinas.add(disciplina);
    }
    public boolean hasDisciplina(String disciplina){
        return disciplinas.contains(disciplina);
    }
}
