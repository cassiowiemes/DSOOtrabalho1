import java.util.HashSet;
import java.util.ArrayList;

public class CtrlEmprestimo {

	private CtrlPrincipal ctrlPrincipal;
	private HashSet<Emprestimo> emprestimos;
	private TelaEmprestimo telaEmprestimo;
	private int dataAtual;

	public CtrlEmprestimo(CtrlPrincipal ctrlPrincipal, int dataAtual){
		this.ctrlPrincipal = ctrlPrincipal;
		this.dataAtual = dataAtual;
		emprestimos = new HashSet<>();
	}

	public void efetuaEmprestimo() {
		telaEmprestimo.iniciaEmprestimo();
		Emprestimo emprestimo = new Emprestimo(ctrlPrincipal.getUsuario(), ctrlPrincipal.getExemplar());
		//verifica se empréstimo é possível
		if(!emprestimo.isUsuarioDisponivel()){
			telaEmprestimo.usuarioIndisponivel();
			return;
		}
		if(!emprestimo.isExemplarDisponivel()){
			telaEmprestimo.exemplarIndisponivel();
			return;
		}
		emprestimo.efetuaEmprestimo(dataAtual);
		emprestimos.add(emprestimo);
		telaEmprestimo.finalizaEmprestimo(emprestimo.getCodigo());
	}

	public void efetuaDevolucao(){
		telaEmprestimo.iniciaDevolucao();
		int codigoEmprestimo = telaEmprestimo.getCodigoEmprestimo();
		Emprestimo emprestimo = findEmprestimo(codigoEmprestimo);
		if(emprestimo == null){
			telaEmprestimo.entradaInvalida();
			return;
		}
		float multa = emprestimo.getMulta(dataAtual);
		telaEmprestimo.exibeMulta(multa);
		emprestimo.efetuaDevolucao(dataAtual);
		telaEmprestimo.finalizaDevolucao();
	}

	public Emprestimo findEmprestimo(int codigoEmprestimo) {
		for(Emprestimo emprestimo : emprestimos){
			if(emprestimo.getCodigo() == codigoEmprestimo){
				return emprestimo;
			}
		}
		return null;
	}

	public void geraRelatorio() {
		ArrayList<String> nomesUsuarios = new ArrayList<>();
		ArrayList<String> tituloItens = new ArrayList<>();
		ArrayList<Integer> codigosExemplares = new ArrayList<>();
		for(Emprestimo emprestimo : emprestimos){
			if(emprestimo.getDataDevolucao() == 0 && emprestimo.getDataPlanejadaDevolucao() < dataAtual){
				emprestimo.getNomeUsuario();
				tituloItens.add(ctrlPrincipal.getTituloItem(emprestimo.getCodigoItem()));
				codigosExemplares.add(emprestimo.getCodigoExemplar());
			}
		}
		telaEmprestimo.imprimeRelatorio(nomesUsuarios, tituloItens, codigosExemplares);
	}

	public void iniciar(){
		int opcao = 0;
		do{
			opcao = telaEmprestimo.iniciar();
			switch(opcao){
				case 1:
					efetuaEmprestimo();
					break;
				case 2:
					efetuaDevolucao();
					break;
				case 3:
					geraRelatorio();
					break;
				case 4:
					telaEmprestimo.sair();
					return;
				default:
					telaEmprestimo.entradaInvalida();
			}
		}while(opcao != 4);
	}
}
