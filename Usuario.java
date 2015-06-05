
public class Usuario implements IUsuario {

    private String nome;
    private int codigo;
    private int idade;
    private String endereco;
    private String nomePai;
    private String nomeMae;
    private int prazoDevolucao;
    private int numeroEmprestimosAtual;
    private final int numeroEmprestimosMax = 3;
    private static int contador = 0;

    public Usuario(String nome, int idade, String endereco, String nomePai,
            String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        contador++;
        this.codigo = contador;
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

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }
}
