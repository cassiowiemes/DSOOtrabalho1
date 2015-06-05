
import java.util.HashSet;

public class CtrlItem {

    private HashSet<Item> itens = new HashSet<>();
    private CtrlPrincipal ctrlPrincipal;
    private TelaItem telaItem;

    public CtrlItem(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

    public void iniciar() {
        int opcao = 0;
        do {
            opcao = telaItem.iniciar();
            switch (opcao) {
                case 1:                                            //cadastrar item
                    cadastraItem();
                    break;
                case 2:
                    //removeItem();
                    break;
                case 3:
                    int opProcurar;
                    do {
                        opProcurar = telaItem.procurarItem();
                        if (opProcurar == 1) {
                            getTitulo(telaItem.pegaCodigoParaProcurar());
                        }
                        if (opProcurar == 2) {
                            getCodigo(telaItem.pegaTituloParaProcurar());
                        }
                    } while (opProcurar >= 1 && opProcurar <= 2);
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
        } while (opcao != 7);
    }

    public void cadastraItem() {
        int opcaoItem = telaItem.opcaoItemACriar();
        if (opcaoItem == 0)
            cadastraLivro();
        if (opcaoItem == 1)
        	cadastraRevista();
    }

    private void cadastraRevista()
	{
    	String titulo = telaItem.getTitulo();
    	String editora = telaItem.getEditora();
    	int ano = telaItem.getAno();
        FaixaEtaria faixaEtaria = telaItem.getFaixaEtaria();
        int edicao = telaItem.getEdicao();
        Periodicidade periodicidade = telaItem.getPeriodicidade();
        Revista revista = new Revista(titulo, editora, ano, faixaEtaria, edicao, periodicidade);
        itens.add(revista);
	}

	private void cadastraLivro()
	{
    	String titulo = telaItem.getTitulo();
    	String editora = telaItem.getEditora();
    	int ano = telaItem.getAno();
        FaixaEtaria faixaEtaria = telaItem.getFaixaEtaria();
        HashSet<String> autores = telaItem.getAutores();
        int edicao = telaItem.getEdicao();
        Genero genero = telaItem.getGenero();
        Livro livro = new Livro(titulo, editora, ano, faixaEtaria, autores, edicao, genero);
        itens.add(livro);
	}

	public void removeItem(Item item) {
        itens.remove(item);
    }

    public String getTitulo(int codigo) {
        for (Item item : itens) {
            if (item.getCodigo() == codigo) {
                return item.getTitulo();
            }
        }
        return null;
    }

    public int getCodigo(String titulo) {
        for (Item item : itens) {
            if (item.getTitulo() == titulo) {
                return item.getCodigo();
            }
        }
        return -1;
    }

    public void cadastraExemplar() {

    }

    public void removeExemplar() {

    }

    public void findExemplar(int codigo) {

    }

    public IExemplar getExemplar() {
        return null;
    }

    public String getTitulo() {
        return "Um titulo qualquer";
    }
}
