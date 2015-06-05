public class Aluno extends Usuario {

	private int finalPrazoDevolucao;
	private int finalNumeroEmprestimos;
	private String turma;

    public Aluno(String nome, int idade, String endereco, String nomePai, String nomeMae, String turma){
    	super(nome,idade,endereco,nomePai,nomeMae);
    	this.turma = turma;
        super.setPrazoDevolucao(finalPrazoDevolucao);
        super.setPrazoDevolucao(finalNumeroEmprestimos);
    }

    public String getTurma(){
    	return this.turma;
    }

}
