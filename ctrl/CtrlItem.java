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
	
	public void realizaAcao(int command){
		switch(command){
		//salvar livro
		case 11:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//limpar livro
		case 12:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//voltar livro
		case 13:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//salvar revista
		case 21:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//limpar revista
		case 22:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		//voltar revista
		case 23:
	    	tela.setVisible(false);
	    	ctrl.iniciar();
			break;
		}
	}

	public void iniciar() {
		tela.setVisible(true);
	}

	public void registraRevista(ItemWrapper item) {
		Revista revista = new Revista(item.titulo, item.editora, item.ano, 
				FaixaEtaria.valueOf(item.faixaEtaria), item.edicao, 
				Periodicidade.valueOf(item.periodicidade));
		mapeadorRevista.put(revista);
	}
	
	public void registraLivro(ItemWrapper item){
		Livro livro = new Livro(item.titulo, item.editora, item.ano,
				FaixaEtaria.valueOf(item.faixaEtaria), item.autores, item.edicao,
				Genero.valueOf(item.genero));
		mapeadorLivro.put(livro);
	}

	public Exemplar getExemplar(int codigo) {
		// TODO
		return null;
	}
	
	public void addExemplar(Integer idItem) {
		// TODO
	}
}
