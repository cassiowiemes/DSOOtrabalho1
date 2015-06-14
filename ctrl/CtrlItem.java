package ctrl;
import model.Exemplar;
import model.Item;
import view.TelaItem;

import javax.swing.JPanel;

public class CtrlItem {

    private CtrlPrincipal ctrlPrincipal;
    private TelaItem tela;

    public CtrlItem(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.tela = new TelaItem();
    }

    public void iniciar() {
    	
    }

	public JPanel getTela() {
		return tela;
	}

	public Exemplar getExemplar(int codigo) {
		return null;
	}
}
