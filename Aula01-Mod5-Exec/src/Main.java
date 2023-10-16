import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String numberStr = "123a";
            int number = Integer.parseInt(numberStr);
            System.out.println("Número: " + number);
        }catch(NumberFormatException e){
            System.out.println("Não é possível converter para inteiro. Verifique a variável.");
        }


        try {
            Scanner sc = null;

            sc.nextInt();
        }catch(NullPointerException e){
            System.out.println("Variável nula. Verifique o código");
        }
    }
}