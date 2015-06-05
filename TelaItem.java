
import java.util.Scanner;
import java.util.HashSet;

public class TelaItem {
<<<<<<< HEAD
	
	Scanner sc = new Scanner(System.in);
	public int iniciar(){
		
		System.out.println("SISTEMA DE GERENCIAMENTO DE ITENS.");
		System.out.println("SELECIONE A OPÇÃO DESEJADA:");
		System.out.println("1: Cadastrar novo item.");
		System.out.println("2: Remover item.");
		System.out.println("3: Procurar item.");
		System.out.println("4: Cadastrar um exemplar.");
		System.out.println("5: remover um exemplar.");
		System.out.println("6: Procurar por um exemplar.");
		System.out.println("7: Sair.");
		return sc.nextInt();
	}
	
	public int opcaoItemACriar()
	{
		System.out.println("0: cadastrar livro");
		System.out.println("1: cadastrar revista");
		return sc.nextInt();
	}
	
	public String getGenero()
	{
		System.out.println("entre com o genero: (COMEDIA, DRAMA, POLICIAL");
		return sc.next();
	}
	
	public HashSet<String> getAutores()
	{
		HashSet<String> autores = new HashSet<>();
		System.out.println("quanto autores deseja cadastrar? ");
		for (int i = 0; i < sc.nextInt(); i++)
		{
			System.out.println("entre com o autor:");
			autores.add(sc.next());			
		}
		return autores;
	}
	
	public int getAno()
	{
		System.out.println("entre com o ano de publicacao: ");
		return sc.nextInt();
	}
	public String getTitulo()
	{
		System.out.println("entre com o titulo: ");
		return sc.next();
	}
	
	public String getEditora()
	{
		System.out.println("entre com a editora:");
		return sc.next();
	}
	
	public String getFaixaEtaria()
	{
		System.out.println("faixa etaria :(INFANTIL, JUVENIL, ADULTO)");
		return sc.next();
	}
	
	public int getEdicao()
	{
		System.out.println("entre com a edicao");
		return sc.nextInt();
	}

	public String getPeriodicidade()
	{
		System.out.println("entre com a periodicidade");
		return sc.next();
	}
	
	public int procurarItem()
	{
		System.out.println("1: produrar o codigo por titulo");
		System.out.println("2: produrar o titulo pelo código");
		return sc.nextInt();		
	}
	
	public String pegaTituloParaProcurar()
	{
		System.out.println("entre com o titulo: ");
		return sc.next();
	}
	
	public int pegaCodigoParaProcurar()
	{
		System.out.println("entre com o codigo: ");
		return sc.nextInt();
	}
	
	public void sair(){
		System.out.println("Obrigado por usar o nosso sistema.");
		System.out.println("Saindo...");
	}
	
	public void entradaInvalida(){
		System.out.println("Entrada invalida!");
	}
}
