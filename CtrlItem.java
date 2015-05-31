import java.util.HashSet;

public class CtrlItem {

	private HashSet<Item> itens = new HashSet<>();
	private CtrlPrincipal ctrlPrincipal;
	private TelaItem telaItem;
	
	public void iniciar(){
		int opcao = 0;
		do{
			opcao = telaItem.iniciar();
			switch(opcao){ 
				case 1:                                            //cadastrar item
					int opCadastrar = telaItem.opcaoItemACriar();
					if(opCadastrar == 1)   //cadastrar livro
						cadastraItem(telaItem.cadastrarLivro());
					if(opCadastrar == 2)   //cadastrar revista
						cadastraItem(telaItem.cadastrarRevista());
					break;
				case 2:
					//removeItem();
					break;
				case 3:
					int opProcurar;
					do{
						opProcurar = telaItem.procurarItem();
						if(opProcurar == 1){
							getTitulo(telaItem.pegaCodigoParaProcurar());
						}
						if(opProcurar ==2){
							getCodigo(telaItem.pegaTituloParaProcurar());
						}
					}while(opProcurar >= 1 && opProcurar <= 2);
					break;
				case 4:
					cadastraExemplar();
					return;

				case 5:
					removeExemplar();

				case 6:
					findExemplar(telaItem.pegaCodigoParaProcurar());
				default:
					telaItem.entradaInvalida();
			}
		}while(opcao != 7);
	}
	

	public void cadastraItem(Item item)
	{
		itens.add(item);
	}

	public void removeItem(Item item) {
		itens.remove(item);

	}

	public String getTitulo(int codigo) {
		for(Item item : itens)
		{
			if(item.getCodigo()== codigo)
				return item.getTitulo();
		}
		return null;
	}

	public int getCodigo(String titulo) {
		for(Item item : itens)
		{
			if(item.getTitulo()== titulo)
				return item.getCodigo();
		}
		return -1;
		}

	public void cadastraExemplar() {

	}

	public void removeExemplar() {

	}

	public void findExemplar(int codigo) {

	}

}
