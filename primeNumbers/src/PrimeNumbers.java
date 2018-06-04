import java.util.Scanner;

public class PrimeNumbers {



    public static void main(String[] args) {
        //this is a class that checks the input if its a prime number

        int inputuser =0;
        boolean primeyes = true;
        System.out.println("Welcome to my awesome automaton to check PrimeNumbers, please insert a number to check: ");
        Scanner input = new Scanner(System.in);
        inputuser = input.nextInt();

        for (int i =2;i <= inputuser -1;i++){
            if(inputuser%i == 0){
                primeyes = false;
                break;
            }
        }


        if (primeyes) {
            System.out.println("the number: " + inputuser + " is a prime!");
        }
            else{
            System.out.println("the number: " + inputuser + " is not a prime!");
            }
        }

    }

