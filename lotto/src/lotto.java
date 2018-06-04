import java.util.Arrays;

public class lotto {
    public static void main(String[] args) {
        //dit is een lotto programma 6 random int numbers en elke moet identiek zijn

        int min = 1;
        int max = 45;
        int[] trekking = new int[6];

        for (int i = 0; i < trekking.length; i++) {
            int pick = pickUniqueNumber(min,max,trekking);
            trekking[i] = pick;

        }
        Arrays.sort(trekking);
        printTrekking(trekking);

    }

    private static int pickUniqueNumber(int min,int max, int[] trekking) {
        int candidate = random(min,max);
        while(alreadyPicked(candidate,trekking)){
            candidate = random(min,max);
        }
        return candidate;
    }

    private static boolean alreadyPicked(int candidate,int[] trekking) {
        for (int reedsAanwezig : trekking){
            if(candidate == reedsAanwezig)
                return true;
        }
        return false;
    }

    public static int random(int min,int max){
       return (int) (Math.random() * (max - min +1) + min);
    }

    public static void printTrekking(int[] trekking){
        for (int i : trekking) {
            System.out.println(i +" ");

        }
    }
}
