package model;
public abstract interface IExemplar {

    public abstract int getCodigoItem();

    public abstract int getCodigoExemplar();

    public abstract boolean isDisponivel();

    public abstract void setDisponivel(boolean estado);

    public int getCodigo();

}
