package ctrl;
import model.*;
import view.*;
public class CtrlPrincipal {

    private CtrlItem ctrlItem;
    private CtrlEmprestimo ctrlEmprestimo;
    private CtrlUsuario ctrlUsuario;
    private TelaPrincipal telaPrincipal;

    public CtrlPrincipal() {
        ctrlItem = new CtrlItem(this);
        ctrlEmprestimo = new CtrlEmprestimo(this, 18);
        //18 fica como substituto para o dia atual que seria obtido usando java Date
        ctrlUsuario = new CtrlUsuario(this);
        telaPrincipal = new TelaPrincipal();
    }

    public void iniciar() {
        int opcao = 0;
        do {
            opcao = telaPrincipal.iniciar();
            switch (opcao) {
                case 1:
                    ctrlEmprestimo.iniciar();
                    break;
                case 2:
                    ctrlUsuario.iniciar();
                    break;
                case 3:
                    ctrlItem.iniciar();
                    break;
                case 4:
                    telaPrincipal.sair();
                    return;
                default:
                    telaPrincipal.entradaInvalida();
            }
        } while (opcao != 4);
    }

    public IUsuario getUsuario() {
        return ctrlUsuario.getUsuario();
    }

    public IExemplar getExemplar() {
        return ctrlItem.getExemplar();
    }

    public String getTituloItem(int codigo) {
        return ctrlItem.getTitulo();
    }
}
