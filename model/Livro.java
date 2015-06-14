package model;
import java.util.HashSet;

public class Livro extends Item {

    private HashSet<String> autores = new HashSet<>();
    private int edicao;
    private Genero genero;
    private Integer id;

    public Livro(String titulo, String editora, int ano,
            FaixaEtaria faixaEtaria, HashSet<String> autores, int edicao,
            Genero genero) {
        super(titulo, editora, ano, faixaEtaria);
        this.autores = autores;
        this.setEdicao(edicao);
        this.setGenero(genero);
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
	public void setId(int id)
	{
		this.id = id;		
	}
	
	public enum Genero {

	    COMEDIA,
	    DRAMA,
	    POLICIAL,
	    FANTASIA,
	    HISTORIA,
	    DOCUMENTARIO;
	}

}
