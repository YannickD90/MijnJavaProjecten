import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalFormatClass {
    public static void main(String[] args) {
        double a = 5;int b = 3;
        double berekening = a/b;
        DecimalFormat f = new DecimalFormat("##0.00"); // alt + enter to import decimalFormat
        System.out.println(f.format(berekening));

        System.out.println("What is your name user ? : ");
        Scanner userInput = new Scanner(System.in);
        String username = userInput.nextLine();
        System.out.println("Hello " + username);
    }
}
