import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static int generator(int min, int max){
        int rand = (int) (min + (max - min +1) * Math.random());
        return rand;
    }

    public static boolean prime(int number){
        boolean primeyes = true;
        for (int i =2;i <= number -1;i++){
            if(number%i == 0){
                primeyes = false;
                break;
            }
        }
        return primeyes;
    }

    public static void main(String[] args) {
        //this is a class that palys a guessing game

        int min =0;
        int max =0;
        double randomnumber =0;
        Scanner input = new Scanner(System.in);
        int guess = 0;


        System.out.println("please give me the starting number between 0 and 100 : ");
        min = input.nextInt();

        System.out.println("please give me the end number between 0 and 100 : ");
        max = input.nextInt();

        //Random generator = new Random(System.currentTimeMillis());
        //randomnumber = generator.nextInt(max);

        //randomnumber = Math.random(System.nanoTime())*100;
        //int randomnumber2 = (int)randomnumber;
        int randomnumber2 = generator(min,max);

        if (prime(randomnumber2)){
            System.out.println("Hint: the number is a prime!");
        }else{
            System.out.println("Hint: the number is not a prime");
        }



        if (randomnumber2 < min){
            randomnumber2 = min;
        }

        if (randomnumber2 > max){
            randomnumber2 = max;
        }

        System.out.println(randomnumber2);

        for (int i = 0;i < 3;i++) {
            System.out.println("please guess the number between 0 and 100: ");
            guess = input.nextInt();
            if (guess == randomnumber2) {
                System.out.println("you guessed right! it's : " + guess);
                break;
            } else {
                System.out.println("Oops! wrong guess, try again!");
                if (guess < randomnumber2){
                    System.out.println("your guess was too low");
                }else{
                    System.out.println("your guess was too high");
                }

            }

        }
        System.out.println("game over!");
    }
}
