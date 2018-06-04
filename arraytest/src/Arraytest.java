public class Arraytest {
    public static void main(String[] args) {
        //this is my first array class
        int i = 5;
        int[] j = {1,2,5,7,9,-6,12};
        //System.out.println(j.length);

        int getal = j[2];
        //System.out.println(getal);

        int[] k = {0,0,0,0,0,0,0,0,0,0,0,0};
        //System.out.println(k.length);

        for (int x = 0; i < 10;x++){
            k[x] = x;
            System.out.println(k[x]);

        }


    }
}
