import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        String dataString = sc.next();

        LocalDate dataDaString = LocalDate.parse(dataString, formatador);

        System.out.println(dataDaString);

    }
}