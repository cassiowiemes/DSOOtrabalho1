public enum Genero {
	
	COMEDIA(1),
	DRAMA(2),
	POLICIAL(3),
	FANTASIA(4),
	HISTORIA(5),
	DOCUMENTARIO(6);

	public int codigo;
		
	private Genero(int codigo)
	{
		this.codigo = codigo;
	}
}
