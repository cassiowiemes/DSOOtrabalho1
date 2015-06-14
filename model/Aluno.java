package model;

public class Aluno extends Usuario {

	private final int prazoDevolucao = 7;
	private final int numeroEmprestimosMax = 3;

    public Aluno(String nome, int idade, String endereco, String nomePai, String nomeMae) {
        super(nome, idade, endereco, nomePai, nomeMae);
        super.setPrazoDevolucao(prazoDevolucao);
        super.setNumeroEmprestimosMax(numeroEmprestimosMax);
    }
}
