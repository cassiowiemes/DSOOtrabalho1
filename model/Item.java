package model;
import java.io.Serializable;
import java.util.HashSet;

public abstract class Item  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private int id;
    private String editora;
    private int ano;
    private FaixaEtaria faixaEtaria;
    private HashSet<Exemplar> exemplares = new HashSet<>();

    public Exemplar getExemplar(Item item) {
        for (Exemplar exemplar : exemplares) {
        	//TODO
        }
        return null;
    }

    public Item(String titulo, String editora, int ano, FaixaEtaria faixaEtaria) {
        super();
        this.setTitulo(titulo);
        this.setEditora(editora);
        this.setAno(ano);
        this.faixaEtaria = faixaEtaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int codigo) {
        this.id = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    public enum FaixaEtaria {
        INFANTIL,
        JUVENIL,
        ADULTO;
    }
}
