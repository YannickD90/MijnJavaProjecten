package weatherProjector;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {

        String[] arrayOfMonths = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OKTOBER","NOVEMBER","DECEMBER"};
        System.out.println("Please give me a month and I will tell you the average temperature ");
        System.out.println("Your choices are: ");

        System.out.println(" ");

        System.out.println("JANUARY");
        System.out.println("FEBRUARY");
        System.out.println("MARCH");
        System.out.println("APRIL");
        System.out.println("MAY");
        System.out.println("JUNE");
        System.out.println("JULY");
        System.out.println("AUGUST");
        System.out.println("SEPTEMBER");
        System.out.println("OKTOBER");
        System.out.println("NOVEMBER");
        System.out.println("DECEMBER");

        System.out.println(" ");

        System.out.println("Please enter your choice now: ");

        Scanner userInput = new Scanner(System.in);

        String monthSelected = userInput.nextLine();
        monthSelected = monthSelected.toUpperCase();


        Arrays.asList(arrayOfMonths).contains(monthSelected);

        if(Arrays.asList(arrayOfMonths).contains(monthSelected)){
            System.out.println("The average Temperature of the Month: " + monthSelected +" Is: " + (Month.valueOf(monthSelected)).getAverageTemp() + " °c");
        }
        else{
            System.out.println("OOps! you didn't give in a month! try again pls");
        }


    }
}
