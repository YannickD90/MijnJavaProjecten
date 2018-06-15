package megacalc;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MegaCalc {



    public static void main(String[] args) {
        //this is a mega calculator

        double getalA =0;
        double getalB =0;


        String bewerking;
        boolean foutInput = true;

        System.out.println("Hey user! This is a Mega Calculator! ");

        while(foutInput){

            try{

                System.out.println("You can do the following Things: ");

                System.out.println("PLUS");
                System.out.println("MINUS");
                System.out.println("MAAL");
                System.out.println("OVER");

                System.out.println("Please type which one you want to do: ");

                Scanner scanner = new Scanner(System.in);
                bewerking = scanner.nextLine();

                bewerking = bewerking.toUpperCase();

                getalA = getvalue("A");
                getalB = getvalue("B");

                if(bewerking.equals(calculator.PLUS.name())){
                    plus(getalA,getalB);

                }else if(bewerking.equals(calculator.MINUS.name())){
                    minus(getalA,getalB);

                }else if(bewerking.equals(calculator.MAAL.name())){
                    maal(getalA,getalB);

                }else if(bewerking.equals(calculator.OVER.name())){
                    over(getalA,getalB);


                }else{
                    System.out.println("This is not an action!! ");
                }



            }catch(InputMismatchException e){
                System.out.println("inputmismatch");
                e.printStackTrace();
                e.getMessage();
            }catch(IllegalArgumentException e){
                System.out.println("illegal argument");
                e.printStackTrace();
                e.getMessage();
            }catch(ArithmeticException e){
                System.out.println("arithmic exception");
                e.printStackTrace();
                e.getMessage();
            }



        }


    }

    public static double getvalue(String value) {

        Scanner scanner = new Scanner(System.in);
        double getal = 0;
        boolean valueWrong = true;

        while (valueWrong) {

            try {
                System.out.println("Please insert number " + value + " : ");
                getal = scanner.nextDouble();
                valueWrong = false;

            } catch (InputMismatchException e) {
                System.out.println("thats not a number I can work with!");
                e.getMessage();
                e.printStackTrace();
            }
        }
        return getal;
    }




    public static void plus(double getalA,double getalB){

        double output = calculator.plus(getalA,getalB);
        System.out.println(output);

    }

    public static void minus(double getalA,double getalB){

        double output = calculator.minus(getalA,getalB);
        System.out.println(output);


    }

    public static void maal(double getalA,double getalB){

         double output = calculator.maal(getalA,getalB);
         System.out.println(output);

    }

    public static void over(double getalA, double getalB){

            if(getalB != 0) {
                double output = calculator.over(getalA, getalB);
                System.out.println(output);

            }else{
                System.out.println("delen door null is flauwekul!");

            }

        }

}


