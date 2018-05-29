import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        double g = 6.67e-11;
        double m1 = 10;
        double m2 = 7;

        System.out.println("give me a radius for my automaton calculations");
        Scanner reading = new Scanner(System.in);
        int radius = reading.nextInt();
        System.out.println(radius);

        double a = Math.pow(Math.PI,2);
        System.out.println(a);

        System.out.println(Math.pow(2*Math.PI,radius));

        double c = 2*radius + (Math.sin((radius/3)));
        System.out.println(c);

        double d = (2*Math.log(radius))/Math.sqrt(radius);
        System.out.println(d);

        double d2 = (2*Math.log10(radius))/Math.sqrt(radius);
        System.out.println(d2);

        double e = (radius + 3*Math.sqrt(radius))/2;
        System.out.println(e);

        double f = g* ((m1*m2)/Math.pow(radius,2));
        System.out.println(f);




    }
}
