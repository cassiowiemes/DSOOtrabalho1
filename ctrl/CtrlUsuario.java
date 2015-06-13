package ctrl;
import model.Aluno;
import model.Professor;
import view.TelaUsuario;
import utils.MapeadorAluno;
import utils.MapeadorProfessor;
import javax.swing.JPanel;

public class CtrlUsuario {
	
	MapeadorAluno mapeadorAluno;
	MapeadorProfessor mapeadorProfessor;
    private CtrlPrincipal ctrlPrincipal;
    private TelaUsuario tela;

    public CtrlUsuario(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.tela = new TelaUsuario(this);
        mapeadorAluno = new MapeadorAluno();
        mapeadorProfessor = new MapeadorProfessor();
    }

    public void iniciar() {
    	
    }

	public void realizaAcao(String command) {
		UserWrapper user;
		switch(command){
		case "SalvarAluno":
			user = tela.GetDados();
			mapeadorAluno.put(new Aluno(user.nome, user.idade, user.endereco, user.pai, user.mae, user.turma));
			tela.sucessoCriar();
			tela.limparCampos();
			break;
		case "SalvarProfessor":
			user = tela.GetDados();
			mapeadorProfessor.put(new Professor(user.nome, user.idade, user.endereco, user.pai, user.mae));
			tela.sucessoCriar();
			tela.limparCampos();
			break;
		case "Cancelar":
			tela.limparCampos();
			ctrlPrincipal.hideSecondFrame();
			break;
		}
	}
	
    public JPanel getTela(){
    	return tela;
    }
}
