public class Banking {
    public static void main(String[] args) {
        //this is a banking excercise

        double startKapitaal = 100000;
        double rente = 3.5;
        double termijn = 10;
        double kapitaal = startKapitaal;

        for(double i = 1;i <= termijn;i++) {
            kapitaal = kapitaal * 1.035;
            System.out.println("Your capital due to rente of year " + i + " is: " + kapitaal);


        }
        //System.out.println("This is you capital over " + termijn + "years " + resultaat);
    }
}
