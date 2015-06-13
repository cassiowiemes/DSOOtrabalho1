package ctrl;
import model.*;
import view.*;

import javax.swing.*;

import java.util.HashSet;
import java.util.ArrayList;

public class CtrlEmprestimo {

    private CtrlPrincipal ctrlPrincipal;
    private HashSet<Emprestimo> emprestimos;
    private TelaEmprestimo tela;
    private int dataAtual;

    public CtrlEmprestimo(CtrlPrincipal ctrlPrincipal, int dataAtual) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.dataAtual = dataAtual;
        this.tela = new TelaEmprestimo();
        emprestimos = new HashSet<>();
    }

    public void iniciar() {
    	
    }

	public JPanel getTelaEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}

	public JPanel getTelaDevolucao() {
		return tela;
	}

	public JPanel getTelaRelatorio() {
		return tela;
	}
//
//    public void efetuaEmprestimo() {
//        telaEmprestimo.iniciaEmprestimo();
//        Emprestimo emprestimo = new Emprestimo(ctrlPrincipal.getUsuario(), ctrlPrincipal.getExemplar());
//        //verifica se empréstimo é possível
//        if (!emprestimo.isUsuarioDisponivel()) {
//            telaEmprestimo.usuarioIndisponivel();
//            return;
//        }
//        if (!emprestimo.isExemplarDisponivel()) {
//            telaEmprestimo.exemplarIndisponivel();
//            return;
//        }
//        emprestimo.efetuaEmprestimo(dataAtual);
//        emprestimos.add(emprestimo);
//        telaEmprestimo.finalizaEmprestimo(emprestimo.getCodigo());
//    }
//
//    public void efetuaDevolucao() {
//        telaEmprestimo.iniciaDevolucao();
//        int codigoEmprestimo = telaEmprestimo.getCodigoEmprestimo();
//        Emprestimo emprestimo = findEmprestimo(codigoEmprestimo);
//        if (emprestimo == null) {
//            telaEmprestimo.entradaInvalida();
//            return;
//        }
//        float multa = emprestimo.getMulta(dataAtual);
//        telaEmprestimo.exibeMulta(multa);
//        emprestimo.efetuaDevolucao(dataAtual);
//        telaEmprestimo.finalizaDevolucao();
//    }
//
//    public Emprestimo findEmprestimo(int codigoEmprestimo) {
//        for (Emprestimo emprestimo : emprestimos) {
//            if (emprestimo.getCodigo() == codigoEmprestimo) {
//                return emprestimo;
//            }
//        }
//        return null;
//    }
//
//    public void geraRelatorio() {
//        ArrayList<String> nomesUsuarios = new ArrayList<>();
//        ArrayList<String> tituloItens = new ArrayList<>();
//        ArrayList<Integer> codigosExemplares = new ArrayList<>();
//        for (Emprestimo emprestimo : emprestimos) {
//            if (emprestimo.getDataDevolucao() == 0 && emprestimo.getDataPlanejadaDevolucao() < dataAtual) {
//                emprestimo.getNomeUsuario();
//                tituloItens.add(ctrlPrincipal.getTituloItem(emprestimo.getCodigoItem()));
//                codigosExemplares.add(emprestimo.getCodigoExemplar());
//            }
//        }
//        telaEmprestimo.imprimeRelatorio(nomesUsuarios, tituloItens, codigosExemplares);
//    }
}
