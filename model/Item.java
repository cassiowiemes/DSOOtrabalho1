package model;
import java.io.Serializable;
import java.util.HashSet;

public abstract class Item  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private Integer id;
    private String editora;
    private int ano;
	private FaixaEtaria faixaEtaria;
	private int edicao;
    private HashSet<Exemplar> exemplares = new HashSet<>();
    public enum FaixaEtaria {
    	INFANTIL,
    	JUVENIL,
    	ADULTO;
    }
    
    public void setEdicao(int edicao){
    	this.edicao = edicao;
    }
    public Exemplar getExemplar(Integer codigo) {
        for (Exemplar exemplar : exemplares) {
        	if(exemplar.getCodigoExemplar() == codigo){
        		return exemplar;
        	}
        }
        return null;
    }
    
    public void addExemplar(Exemplar exemplar){
    	this.exemplares.add(exemplar);
    }

    public Item(String titulo, String editora, int ano, FaixaEtaria faixaEtaria) {
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
    
}
