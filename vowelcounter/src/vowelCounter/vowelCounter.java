package vowelCounter;

import java.util.Scanner;

public class vowelCounter {

    public static void main(String[] args) {
        //this is a program that counts the vowels of input string

        //int a = 0, e = 0 , i = 0, o = 0 , u = 0;
        int[] klinkers = new int[5]; // 5 klinkers

        System.out.println("please give me a string to see how many vowels are in it");
        Scanner userinput = new Scanner(System.in);

        String inputString = userinput.nextLine().toLowerCase();

        char[] data = converteerNaarArray(inputString);

        int[] letters = new int[26];



        for(char datum : data){

         letters[letterAlsIndex(datum)]++;
        }


        System.out.println("a = " +letters[letterAlsIndex('a')]);
        System.out.println("e = " +letters[letterAlsIndex('e')]);
        System.out.println("o = " +letters[letterAlsIndex('i')]);
        System.out.println("i = " +letters[letterAlsIndex('o')]);
        System.out.println("u = " +letters[letterAlsIndex('u')]);


    }

    public static int letterAlsIndex(char ch){
        return ch - 'a';
    }

    public static char[] converteerNaarArray(String in){
        char[] out = new char[in.length()];
        for (int i = 0; i < in.length();i++){
            out[i] = in.charAt(i);

        }
        return out;


    }


}

