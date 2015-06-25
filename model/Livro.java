package model;
import java.io.Serializable;
import java.util.HashSet;

public class Livro extends Item  implements Serializable {
    private static final long serialVersionUID = 1L;

    private HashSet<String> autores = new HashSet<>();
    private int edicao;
    private Genero genero;

    public Livro(String titulo, String editora, int ano,
            FaixaEtaria faixaEtaria, Genero genero) {
        super(titulo, editora, ano, faixaEtaria);
        this.setGenero(genero);
    }
    
    public void addAutor(String autor){
    	
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
	
	public enum Genero {
	    COMEDIA,
	    DRAMA,
	    POLICIAL,
	    FANTASIA,
	    HISTORIA,
	    DOCUMENTARIO;
	}

}
