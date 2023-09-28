public class Divisao implements OperacaoMatematica{


    @Override
    public int calcula(int a, int b) {
        System.out.println("resultado: " + a / b);
        return a / b;
    }
}
