import java.util.ArrayList;
public class Usuario implements IUsuario {

    private String nome;
    private int codigo;
    private int idade;
    private String endereco;
    private String nomePai;
    private String nomeMae;
    private int prazoDevolucao;
    private int numeroEmprestimosAtual;
    private int numeroEmprestimosMax;
    private static int contador = 0;
        
    public Usuario (String nome, int idade, String endereco, String nomePai, String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        contador++;
        this.codigo = contador;
    }

    public String getNome(){
    	return nome;
    }
    public int getPrazoDevolucao(){
    	return prazoDevolucao;
    }
    public int getNumeroEmprestimosAtual(){
    	return numeroEmprestimosAtual;
    }
    public int getNumeroEmprestimosMax(){
    	return numeroEmprestimosMax;
    }
    public void aumentaEmprestimosAtual(){
    	numeroEmprestimosAtual++;
    }
    public void diminuiEmprestimosAtual(){
	   numeroEmprestimosAtual--;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setPrazoDevolucao(int prazoDevolucao){
        this.prazoDevolucao = prazoDevolucao;
    }
    public void setNumeroMaximoEmprestimos(int numeroMaxEmp){
        this.numeroEmprestimosMax = numeroMaxEmp;
    }
}
