import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
    Somar soma = new Somar();
    Multiplicacao mult = new Multiplicacao();
    Divisao div = new Divisao();
    Subtracao sub = new Subtracao();
        Scanner teclado = new Scanner(System.in);
    System.out.println("Escolha uma operação matemática: (+, -, *, /)");
    String opcao = teclado.nextLine();
    switch(opcao) {
        case "+":
            System.out.println("escolha dois numero:");
            soma.calcula(teclado.nextInt(), teclado.nextInt());
            break;
        case "-":
            System.out.println("escolha dois numero:");
            sub.calcula(teclado.nextInt(), teclado.nextInt());
            break;
        case "*":
            System.out.println("escolha dois numero:");
            mult.calcula(teclado.nextInt(), teclado.nextInt());
            break;
        case"/":
            System.out.println("escolha dois numero:");
            div.calcula(teclado.nextInt(), teclado.nextInt());
            break;
        default:
            System.out.println("operação inválida!!");
            break;
    }
    }
}
