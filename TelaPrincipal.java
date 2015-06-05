
import java.util.Scanner;

public class TelaPrincipal {

    public int iniciar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE GERENCIAMENTO DE EMPRÉSTIMOS.");
        System.out.println("SELECIONE A OPÇÃO DESEJADA:");
        System.out.println("1: Gerenciar empréstimos.");
        System.out.println("2: Gerenciar usuários.");
        System.out.println("3: Gerenciar acervo.");
        System.out.println("4: Sair.");
        return sc.nextInt();
    }

    public void entradaInvalida() {
        System.out.println("Entrada invalida!");
    }

    public void sair() {
        System.out.println("Obrigado por usar o nosso sistema.");
        System.out.println("Saindo...");
    }
}
