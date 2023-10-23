public class Main {
    public static void main(String[] args) {
        Caixa<String> stringCaixa = new Caixa<>();
        stringCaixa.armazenar("quadrado");
        System.out.println(stringCaixa.obter());

        Caixa<Integer> integerCaixa = new Caixa<>();
        integerCaixa.armazenar(20);
        System.out.println(integerCaixa.obter());
    }
}