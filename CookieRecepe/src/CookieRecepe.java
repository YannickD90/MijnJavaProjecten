import java.util.Scanner;

public class CookieRecepe {
    public static void main(String[] args) {
        //this is a recipe for cookies program

        double sugar,butter,flour,cookieDivider,baseCookies,resultFlour,resultButter,resultSugar;
        int cookies;

        sugar = 2;
        butter = 2;
        flour = 2.75;
        baseCookies = 48;

        System.out.println("How many cookies would you like to make ?");
        Scanner sc = new Scanner(System.in);
        cookies = sc.nextInt();


        cookieDivider = cookies / baseCookies;

        resultFlour = cookieDivider * flour;
        resultButter = cookieDivider * butter;
        resultSugar = cookieDivider * sugar;

        System.out.println(" for this amount of cookies you will need " + resultFlour + " cups of flour " + resultButter + " cups of butter "
        + resultSugar + " cups of sugar ");




    }

}
