package model;
public class Exemplar implements IExemplar {

    private int codigoItem;
    private int codigoExemplar;
    private boolean disponivel;
    private String titulo;
    private static int codigoAtual = 0;

    public Exemplar(int codigoExemplar, String titulo, boolean disponivel) {
        super();
        this.codigoItem = codigoAtual;
        this.codigoExemplar = codigoExemplar;
        this.titulo = titulo;
        this.disponivel = disponivel;
        codigoAtual++;
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

    @Override
    public int getCodigo() {
        return 0;
    }

}
