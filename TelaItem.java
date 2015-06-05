
import java.util.Scanner;
import java.util.HashSet;

public class TelaItem {

    Scanner sc = new Scanner(System.in);

    public int iniciar() {

        System.out.println("SISTEMA DE GERENCIAMENTO DE ITENS.");
        System.out.println("SELECIONE A OP��O DESEJADA:");
        System.out.println("1: Cadastrar novo item.");
        System.out.println("2: Remover item.");
        System.out.println("3: Procurar item.");
        System.out.println("4: Cadastrar um exemplar.");
        System.out.println("5: remover um exemplar.");
        System.out.println("6: Procurar por um exemplar.");
        System.out.println("7: Sair.");
        return sc.nextInt();
    }

    public int opcaoItemACriar() {
        System.out.println("0: cadastrar livro");
        System.out.println("1: cadastrar revista");
        return sc.nextInt();
    }

    public Genero getGenero() {
        System.out.println("entre com o genero: (1 - COMEDIA, 2 - DRAMA, 3 - POLICIAL");
        Genero g = null;
        if(sc.nextInt() == 1)
        	return g.COMEDIA;
        if(sc.nextInt() == 2)
        	return g.DRAMA;
        if(sc.nextInt() == 3)
        	return g.POLICIAL;
        if(sc.nextInt() == 4)
        	return g.FANTASIA;
        if(sc.nextInt() == 5)
        	return g.HISTORIA;
        return g.DOCUMENTARIO;
    }

    public HashSet<String> getAutores() {
        HashSet<String> autores = new HashSet<>();
        System.out.println("quanto autores deseja cadastrar? ");
        for (int i = 0; i < sc.nextInt(); i++) {
            System.out.println("entre com o autor:");
            autores.add(sc.next());
        }
        return autores;
    }

    public int getAno() {
        System.out.println("entre com o ano de publicacao: ");
        return sc.nextInt();
    }

    public String getTitulo() {
        System.out.println("entre com o titulo: ");
        return sc.next();
    }

    public String getEditora() {
        System.out.println("entre com a editora:");
        return sc.next();
    }

<<<<<<< HEAD
    public String getFaixaEtaria() {
        System.out.println("faixa etaria :(INFANTIL, JUVENIL, ADULTO)");
        return sc.next();
=======
    public FaixaEtaria getFaixaEtaria() {
        System.out.println("faixa etaria (1:INFANTIL, 2:JUVENIL, 3:ADULTO)");
        FaixaEtaria f = null;
        if(sc.nextInt() == 1)
        	return f.INFANTIL;
        if(sc.nextInt() == 2)
        	return f.JUVENIL;
        return f.ADULTO;
>>>>>>> b7fa9308349077adf2e8791f2392de8e993463f1
    }

    public int getEdicao() {
        System.out.println("entre com a edicao");
        return sc.nextInt();
    }

<<<<<<< HEAD
    public String getPeriodicidade() {
        System.out.println("entre com a periodicidade");
        return sc.next();
    }

    public int procurarItem() {
        System.out.println("1: produrar o codigo por titulo");
        System.out.println("2: produrar o titulo pelo c�digo");
=======
    public Periodicidade getPeriodicidade() {
    	System.out.println("entre com a periodicidade: SEMANAL(1), MENSAL(2), BIMESTRAL(3), TRIMESTRAL(4), SEMESTRAL(5), ANUAL(6);");
    	Periodicidade p = null;
    	if(sc.nextInt() == 1)
    		return p.SEMANAL;
    	if(sc.nextInt() == 2)
    		return p.MENSAL;
    	if(sc.nextInt() == 3)
    		return p.BIMESTRAL;
    	if(sc.nextInt() == 4)
    		return p.TRIMESTRAL;
    	if(sc.nextInt() == 5)
    		return p.SEMESTRAL;
    	return p.ANUAL;
    }

    public int procurarItem() {
        System.out.println("0: produrar o codigo por titulo");
        System.out.println("1: produrar o titulo pelo c�digo");
>>>>>>> b7fa9308349077adf2e8791f2392de8e993463f1
        return sc.nextInt();
    }

    public String pegaTituloParaProcurar() {
        System.out.println("entre com o titulo: ");
        return sc.next();
    }

    public int pegaCodigoParaProcurar() {
        System.out.println("entre com o codigo: ");
        return sc.nextInt();
    }

    public void sair() {
        System.out.println("Obrigado por usar o nosso sistema.");
        System.out.println("Saindo...");
    }

    public void entradaInvalida() {
        System.out.println("Entrada invalida!");
    }
}
