package ctrl;
import model.Exemplar;
import model.Revista;
import model.Livro;
import utils.ItemWrapper;
import utils.MapeadorLivro;
import utils.MapeadorRevista;
import model.Item.FaixaEtaria;
import model.Livro;
import model.Livro.Genero;
import model.Revista;
import model.Revista.Periodicidade;
import view.TelaItem;
import utils.MapeadorLivro;
import utils.MapeadorRevista;

public class CtrlItem {

	private MapeadorLivro mapeadorLivro;
	private MapeadorRevista mapeadorRevista;
    private CtrlPrincipal ctrlPrincipal;
    private TelaItem tela;

    public CtrlItem(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.tela = new TelaItem();
        mapeadorLivro = new MapeadorLivro();
        mapeadorRevista = new MapeadorRevista();
        
    }

    public void iniciar() {
    	tela.setVisible(true);
    }
    
    public void registraRevista(ItemWrapper item){
    	//implementar
    	//Revista revista = new Revista(item.titulo, item.editora, item.ano, FaixaEtaria)item.faixaEtaria, item.edicao, (Periodicidade)item.periodicidade)
    }

	public Exemplar getExemplar(int codigo) {
		
		return null;
	}
	
	public void registrarLivro(){
		
	}
	
	public void registraRevista(){
		
	}
	public void addExemplar(Integer idItem){
		
	}
}
