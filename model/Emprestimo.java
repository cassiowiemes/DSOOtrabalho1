package model;

public class Emprestimo {

    private int dataEmprestimo;
    private int dataPlanejadaDevolucao;
    private int dataDevolucao;
    private Integer id;
    private IUsuario usuario;
    private IExemplar exemplar;
    private final float MULTADIARIA = 10;

    public Emprestimo(IUsuario iUsuario, IExemplar iExemplar) {
        this.usuario = iUsuario;
        this.exemplar = iExemplar;
    }

    public int getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public int getDataPlanejadaDevolucao() {
        return this.dataPlanejadaDevolucao;
    }

    public int getDataDevolucao() {
        return this.dataDevolucao;
    }

    public int getCodigoUsuario() {
        return usuario.getCodigo();
    }

    public String getNomeUsuario() {
        return usuario.getNome();
    }

    public int getCodigoExemplar() {
        return exemplar.getCodigo();
    }

    public int getCodigoItem() {
        return exemplar.getCodigoItem();
    }

    public float getMulta(int dataAtual) {
        int atraso = dataAtual - this.dataEmprestimo;
        if (atraso > 0) {
            return atraso * MULTADIARIA;
        }
        return 0;
    }

    public boolean isUsuarioDisponivel() {
        return (usuario.getNumeroEmprestimosAtual() < usuario.getNumeroEmprestimosMax());
    }

    public boolean isExemplarDisponivel() {
        return exemplar.isDisponivel();
    }

    public void efetuaEmprestimo(int dataEmprestimo) {
        exemplar.setDisponivel(false);
        usuario.aumentaEmprestimosAtual();
        this.dataEmprestimo = dataEmprestimo;
        this.dataPlanejadaDevolucao = dataEmprestimo + usuario.getPrazoDevolucao();
    }

    public void efetuaDevolucao(int dataDevolucao) {
        exemplar.setDisponivel(true);
        usuario.diminuiEmprestimosAtual();
        this.dataDevolucao = dataDevolucao;
    }

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId(){
		return this.id;
	}
}
