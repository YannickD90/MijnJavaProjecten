public class Salaris {
    public static void main(String[] args){


        int aantalKinderen = 2;
        float dagLoon = 100;
        double aantalDagen = 18.5;
        double perKind = 50;
        double treinAbbonement = 150;
        double brutoloon = dagLoon * aantalDagen;
        double kindGeld = aantalKinderen * perKind;
        double nettoloon;
        boolean bedrijfswagen = true;

        nettoloon = brutoloon + kindGeld;

        if(bedrijfswagen == false){
            nettoloon = nettoloon + treinAbbonement;
        }
        System.out.println("Uw brutoloon bedraagt : " + nettoloon);



    }
}
