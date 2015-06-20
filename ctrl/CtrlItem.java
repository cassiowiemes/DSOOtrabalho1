package ctrl;
import model.Exemplar;
import model.FaixaEtaria;
import model.Periodicidade;
import model.Revista;
import model.Livro;
import utils.ItemWrapper;
import utils.MapeadorLivro;
import utils.MapeadorRevista;
import view.TelaItem;

import javax.swing.JPanel;

public class CtrlItem {

    private CtrlPrincipal ctrlPrincipal;
    private TelaItem tela;
    private MapeadorLivro mapeadorLivro;
    private MapeadorRevista mapeadorRevista;

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
    	//Revista revista = new Revista(item.titulo, item.editora, item.ano, (FaixaEtaria)item.faixaEtaria, item.edicao, (Periodicidade)item.periodicidade)
    }

	public Exemplar getExemplar(int codigo) {
		return null;
	}
}
