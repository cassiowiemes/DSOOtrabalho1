package ctrl;
import model.Exemplar;
import utils.ItemWrapper;
import model.Item.*;
import model.Livro;
import model.Livro.*;
import model.Revista;
import model.Revista.*;
import view.TelaItem;
import utils.Mapeador;

public class CtrlItem {

	private Mapeador<Livro> mapeadorLivro;
	private Mapeador<Revista> mapeadorRevista;
	private CtrlPrincipal ctrl;
	private TelaItem tela;

	public CtrlItem(CtrlPrincipal ctrl) {
		this.ctrl = ctrl;
		this.tela = new TelaItem(this);
		mapeadorLivro = new Mapeador<>("livros.txt");
		mapeadorRevista = new Mapeador<>("revistas.txt");
	}
	
	public void realizaAcao(String command){
		switch(command){
		case "Salvar livro":
			registraLivro(tela.getDadosLivro());
			break;
		case "Voltar":
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		case "Salvar Revista":
			registraRevista(tela.getDadosRevista());
			break;
		}
	}

	public void iniciar() {
		tela.setVisible(true);
	}

	public void registraRevista(ItemWrapper item) {
		Revista revista = new Revista(item.titulo, item.editora, item.ano, 
				FaixaEtaria.valueOf(item.faixaEtaria), Periodicidade.valueOf(item.periodicidade));
		revista.setId(mapeadorRevista.getId());
		mapeadorRevista.put(revista.getId(), revista);
		tela.sucesso(revista.getId());
	}
	
	public void registraLivro(ItemWrapper item){
		// TODO adicionar autores e edicao aqui e na interface
		Livro livro = new Livro(item.titulo, item.editora, item.ano,
				FaixaEtaria.valueOf(item.faixaEtaria), Genero.valueOf(item.genero));
		livro.setId(mapeadorLivro.getId());
		mapeadorLivro.put(livro.getId(), livro);
		tela.sucesso(livro.getId());
	}

	public Exemplar getExemplar(int codigo) {
		// TODO implementar busca de exemplar
		return null;
	}
	
	public void addExemplar(Integer idItem) {
		// TODO implementar adicao de exemplar ao item
		
	}
}
