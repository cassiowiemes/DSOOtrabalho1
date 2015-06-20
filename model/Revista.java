package model;

public class Revista extends Item {

    private int edicao;
    private Periodicidade periodicidade;
    private Integer id;

    public Revista(String titulo, String editora, int ano,
            FaixaEtaria faixaEtaria, int edicao, Periodicidade periodicidade) {
        super(titulo, editora, ano, faixaEtaria);
        this.edicao = edicao;
        this.periodicidade = periodicidade;
    }
    
	public void setId(int id)
	{
		this.id = id;		
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
