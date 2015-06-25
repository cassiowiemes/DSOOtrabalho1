package model;

import java.io.Serializable;

public class Exemplar implements IExemplar, Serializable {
    private static final long serialVersionUID = 1L;
    private int codigoItem;
    private int codigoExemplar;
    private boolean disponivel;
    private String titulo;

    public Exemplar(int codigoExemplar, String titulo, boolean disponivel) {
        super(); // TODO porque chamar super?
        this.codigoExemplar = codigoExemplar;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getCodigoItem() {
        return this.codigoItem;
    }

    public int getCodigoExemplar() {
        return this.codigoExemplar;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean estado) {
        disponivel = estado;
    }
}
