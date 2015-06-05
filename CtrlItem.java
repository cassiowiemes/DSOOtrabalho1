
import java.util.HashSet;

public class CtrlItem {

<<<<<<< HEAD
	private HashSet<Item> itens = new HashSet<>();
	private CtrlPrincipal ctrlPrincipal;
	private TelaItem telaItem;
	
	public void iniciar(){
		int opcao = 0;
		do{
			opcao = telaItem.iniciar();
			switch(opcao){ 
				case 1:                                            //cadastrar item
					cadastraItem();
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
	

	public void cadastraItem()
	{
		int opcaoItem = telaItem.opcaoItemACriar();
		if(opcaoItem == 0)
		{
			//Livro livro = new Livro()
		}
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
