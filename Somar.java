public class Somar implements OperacaoMatematica{
    Somar(){

    }
    @Override
    public int calcula(int a, int b) {
        System.out.println("resultado: " + (a + b));
        return a + b;
    }
}
