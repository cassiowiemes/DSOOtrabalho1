package ctrl;
import java.util.Collection;

import model.Exemplar;
import utils.ChaveInvalidaException;
import utils.ItemWrapper;
import model.Item;
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
	private Item manuseio;

	public CtrlItem(CtrlPrincipal ctrl) {
		this.ctrl = ctrl;
		this.tela = new TelaItem(this);
		mapeadorLivro = new Mapeador<>("livros.txt");
		mapeadorRevista = new Mapeador<>("revistas.txt");
        Integer ultimaId = Math.max(mapeadorLivro.getHighestKey(), mapeadorRevista.getHighestKey());
        mapeadorLivro.setLastId(ultimaId);
        mapeadorRevista.setLastId(ultimaId);
	}
	
	public void realizaAcao(String command) throws ChaveInvalidaException{
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
		case "Buscar Item":
			manuseio = buscarItem();
			tela.lbTituloItem.setText(manuseio.getTitulo());
			break;
		case "Adicionar Autor":
			adicionarAutor();
			break;
		case "Definir Edicao":
			definirEdicao();
			break;
		case "Adicionar Exemplar":
			adicionarExemplar();
			break;
		}
	}

	private void adicionarExemplar() {
		try {
			Exemplar exemplar = new Exemplar(Integer.parseInt(tela.tfCodigoExemplar.getText()), 
				manuseio.getTitulo(), true);
			manuseio.addExemplar(exemplar);
			mapeadorLivro.persist();
			mapeadorRevista.persist();
		} catch (NullPointerException e){
			tela.falha("Item ainda não selecionado.");
		} catch (NumberFormatException e){
			tela.falha("Código inválido.");
		}
	}

	private void definirEdicao() {
		try{
			manuseio.setEdicao(Integer.parseInt(tela.tfEdicao.getText()));
		} catch (NullPointerException e){
			tela.falha("Item não selecionado!");
		}
	}

	private void adicionarAutor() {
		try{
			Livro livro = (Livro) manuseio;
			livro.addAutor(tela.tfNomeAutor.getText());
		} catch (NullPointerException e){
			tela.falha("Item não selecionado!");
		}
	}

	private Item buscarItem() throws ChaveInvalidaException {
		Integer id = -1; //gambiarra nervoso!!!
		try {
			id = Integer.parseInt(tela.btBuscarAddExemplar.getText());
		} catch (NumberFormatException e){
			tela.falha("Código inválido, favor verificar...");
		}
		if(mapeadorRevista.get(id) != null) return mapeadorRevista.get(id);
		if(mapeadorLivro.get(id) != null) return mapeadorLivro.get(id);
		throw new ChaveInvalidaException();
	}

	public void iniciar() {
		tela.setVisible(true);
	}

	public void registraRevista(ItemWrapper item) {
		Revista revista = new Revista(item.titulo, item.editora, item.ano, 
				FaixaEtaria.valueOf(item.faixaEtaria), Periodicidade.valueOf(item.periodicidade));
		mapeadorRevista.incrementId();
		mapeadorLivro.incrementId();
		revista.setId(mapeadorRevista.getId());
		mapeadorRevista.put(revista.getId(), revista);
		tela.sucesso(revista.getId());
	}
	
	public void registraLivro(ItemWrapper item){
		Livro livro = new Livro(item.titulo, item.editora, item.ano,
				FaixaEtaria.valueOf(item.faixaEtaria), Genero.valueOf(item.genero));
		mapeadorRevista.incrementId();
		mapeadorLivro.incrementId();
		livro.setId(mapeadorLivro.getId());
		mapeadorLivro.put(livro.getId(), livro);
		tela.sucesso(livro.getId());
	}

	public Exemplar getExemplar(int codigo) throws ChaveInvalidaException {
		Collection<Livro> livros = mapeadorLivro.getValues();
		for(Livro livro : livros){
			if(livro.getExemplar(codigo) != null){
				return livro.getExemplar(codigo);
			}
		}
		Collection<Revista> revistas = mapeadorRevista.getValues();
		for(Revista revista: revistas){
			if(revista.getExemplar(codigo) != null){
				return revista.getExemplar(codigo);
			}
		}
		throw new ChaveInvalidaException();
	}
}
