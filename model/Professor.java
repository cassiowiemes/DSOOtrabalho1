package model;

import java.io.Serializable;

public class Professor extends Usuario  implements Serializable {
    private static final long serialVersionUID = 1L;

	private final int prazoDevolucao = 10;
	private final int numeroEmprestimosMax = 5;

    public Professor(String nome, int idade, String endereco, String nomePai, String nomeMae) {
        super(nome, idade, endereco, nomePai, nomeMae);
        super.setPrazoDevolucao(prazoDevolucao);
        super.setNumeroEmprestimosMax(numeroEmprestimosMax);
    }
}
