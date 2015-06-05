package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

import ctrl.CtrlPrincipal;

public class TelaPrincipal  extends JPanel{

	CtrlPrincipal ctrl;
	JTextArea imagePlaceHolder;
	JTextArea tbDescription;
	JButton btAluno;
	JButton btProfessor;
	JButton btLivro;
	JButton btRevista;
	JButton btExemplar;
	JButton btRelatorio;
	JButton btEmprestimo;
	JButton btDevolucao;
	
	public TelaPrincipal(CtrlPrincipal ctrl){
		this.ctrl = ctrl;
		
		//image and description
		imagePlaceHolder = new JTextArea();
		tbDescription = new JTextArea();
		add(imagePlaceHolder);
		imagePlaceHolder.setEditable(false);
		add(tbDescription);
		tbDescription.setEditable(false);
		
		//buttons
		ButtonManager btMan = new ButtonManager();
		btAluno = new JButton();
		btAluno.setText("Aluno");
		btAluno.addActionListener(btMan);
		add(btAluno);
		btProfessor = new JButton();
		btProfessor.setText("Professor");
		btProfessor.addActionListener(btMan);
		add(btProfessor);
		btLivro = new JButton();
		btLivro.setText("Livro");
		btLivro.addActionListener(btMan);
		add(btLivro);
		btRevista = new JButton();
		btRevista.setText("Revista");
		btRevista.addActionListener(btMan);
		add(btRevista);
		btExemplar = new JButton();
		btExemplar.setText("Exemplar");
		btExemplar.addActionListener(btMan);
		add(btExemplar);
		btRelatorio = new JButton();
		btRelatorio.setText("Relatorio");
		btRelatorio.addActionListener(btMan);
		add(btRelatorio);
		btEmprestimo = new JButton();
		btEmprestimo.setText("Emprestimo");
		btEmprestimo.addActionListener(btMan);
		add(btEmprestimo);
		btDevolucao = new JButton();
		btDevolucao.setText("Devolucao");
		btDevolucao.addActionListener(btMan);
		add(btDevolucao);
	}
	
	private class ButtonManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ctrl.realizaAcao(ae.getActionCommand());
        }
    }

//    public int iniciar() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("SISTEMA DE GERENCIAMENTO DE EMPRÉSTIMOS.");
//        System.out.println("SELECIONE A OPÇÃO DESEJADA:");
//        System.out.println("1: Gerenciar empréstimos.");
//        System.out.println("2: Gerenciar usuários.");
//        System.out.println("3: Gerenciar acervo.");
//        System.out.println("4: Sair.");
//        return sc.nextInt();
//    }
//
//    public void entradaInvalida() {
//        System.out.println("Entrada invalida!");
//    }
//
//    public void sair() {
//        System.out.println("Obrigado por usar o nosso sistema.");
//        System.out.println("Saindo...");
//    }
}
