package ctrl;
import model.Exemplar;
import utils.ItemWrapper;
import model.Item.*;
import utils.MapeadorLivro;
import model.Livro;
import model.Livro.*;
import utils.MapeadorRevista;
import model.Revista;
import model.Revista.*;
import view.TelaItem;

public class CtrlItem {

	private MapeadorLivro mapeadorLivro;
	private MapeadorRevista mapeadorRevista;
	private CtrlPrincipal ctrl;
	private TelaItem tela;

	public CtrlItem(CtrlPrincipal ctrl) {
		this.ctrl = ctrl;
		this.tela = new TelaItem(this);
		mapeadorLivro = new MapeadorLivro();
		mapeadorRevista = new MapeadorRevista();
	}
	
	public void realizaAcao(String command){
		switch(command){
		case "Salvar livro"://salvar livro
			registraLivro(tela.getDadosLivro());
			break;
		case "Voltar"://voltar livro
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		case "Salvar Revista"://salvar revista
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
		mapeadorRevista.put(revista);
		tela.sucesso(revista.getId());
	}
	
	public void registraLivro(ItemWrapper item){
		// TODO adicionar autores e edicao aqui e na interface
		Livro livro = new Livro(item.titulo, item.editora, item.ano,
				FaixaEtaria.valueOf(item.faixaEtaria), Genero.valueOf(item.genero));
		mapeadorLivro.put(livro);
	}

	public Exemplar getExemplar(int codigo) {
		// TODO implementar busca de exemplar
		return null;
	}
	
	public void addExemplar(Integer idItem) {
		// TODO implementar adicao de exemplar ao item
	}
}
