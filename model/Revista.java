package model;

import java.io.Serializable;

public class Revista extends Item  implements Serializable {
    private static final long serialVersionUID = 1L;

    private int edicao;
    private Periodicidade periodicidade;

    public Revista(String titulo, String editora, int ano,
            FaixaEtaria faixaEtaria, int edicao, Periodicidade periodicidade) {
        super(titulo, editora, ano, faixaEtaria);
        this.edicao = edicao;
        this.periodicidade = periodicidade;
    }
	
	public enum Periodicidade {
	    SEMANAL,
	    MENSAL,
	    BIMESTRAL,
	    TRIMESTRAL,
	    SEMESTRAL,
	    ANUAL;
	}
}
