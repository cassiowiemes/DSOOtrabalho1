
public abstract interface IUsuario {

    public abstract String getNome();

    public abstract int getCodigo();

    public abstract int getPrazoDevolucao();

    public abstract int getNumeroEmprestimosAtual();

    public abstract int getNumeroEmprestimosMax();

    public abstract void aumentaEmprestimosAtual();

    public abstract void diminuiEmprestimosAtual();

}
