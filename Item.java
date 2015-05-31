import java.util.HashSet;

public abstract class Item {

	private int codigo;
	private String titulo;
	private String editora;
	private int ano;
	private HashSet<IExemplar> exemplares = new HashSet<>();
	private static int codigoAtual = 0;
	private FaixaEtaria faixaEtaria;


	public Exemplar getExemplar(Item item) {
		for(IExemplar exemplar : exemplares)
		{
			
		}
		return null;
	}

	public Item(String titulo, String editora, int ano, FaixaEtaria faixaEtaria)
	{
		super();
		this.setCodigo(codigoAtual);
		this.setTitulo(titulo);
		this.setEditora(editora);
		this.setAno(ano);
		this.faixaEtaria = faixaEtaria;
		codigoAtual++;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getTitulo()
	{
		return titulo;
	}
	
	public static int getCodigoAtual()
	{
		return codigoAtual;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getEditora()
	{
		return editora;
	}

	public void setEditora(String editora)
	{
		this.editora = editora;
	}

	public int getAno()
	{
		return ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public FaixaEtaria getFaixaEtaria()
	{
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtaria faixaEtaria)
	{
		this.faixaEtaria = faixaEtaria;
	}

}
