package decimalformatexc;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        DecimalFormat f = new DecimalFormat("#,##0.00");
        double input = 1507.8341;

        System.out.println(f.format(input));

        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.nextLine();
        double output = 0;

        try {
            output = (double) f.parse(input2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(output);
    }


}

