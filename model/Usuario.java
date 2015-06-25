package model;
public abstract class Usuario implements IUsuario {

    private String nome;
    private int idade;
    private String endereco;
    private String nomePai;
    private String nomeMae;
    private int prazoDevolucao;
    private int numeroEmprestimosAtual;
    private int numeroEmprestimosMax;
    private Integer id;

    public Usuario(String nome, int idade, String endereco, String nomePai,
            String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.numeroEmprestimosAtual = 0;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    @Override
    public int getNumeroEmprestimosAtual() {
        return numeroEmprestimosAtual;
    }

    @Override
    public int getNumeroEmprestimosMax() {
        return numeroEmprestimosMax;
    }

    @Override
    public void aumentaEmprestimosAtual() {
        numeroEmprestimosAtual++;
    }

    @Override
    public void diminuiEmprestimosAtual() {
        numeroEmprestimosAtual--;
    }

    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }
    @Override
    public void setId(Integer id){
    	this.id = id;
    }
    @Override
    public Integer getId(){
    	return id;
    }

	public void setNumeroEmprestimosMax(int numeroEmprestimosMax) {
		this.numeroEmprestimosMax = numeroEmprestimosMax;
	}
}
