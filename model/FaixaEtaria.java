package model;
public enum FaixaEtaria {

    INFANTIL(1),
    JUVENIL(2),
    ADULTO(3);

    public int codigo;

    private FaixaEtaria(int codigo) {
        this.codigo = codigo;
    }
}
