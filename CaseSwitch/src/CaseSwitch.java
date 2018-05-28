import java.sql.SQLOutput;

public class CaseSwitch {
    public static void main(String[] args) {
        String maand = "sep";

        switch (maand){
            case "sep":
                System.out.println("te klein");
                break;
            case "okt":

            case "nov":

            case "dec":
                System.out.println("superlekker");
                break;
            case "jan":

            case "feb":

            case "mrt":

            case "apr":
                System.out.println("Einde seizoen");
                break;
            case "mei":

            case "jun":

            case "jul":

            case "aug":
                System.out.println("nee");
                break;
            default:
                System.out.println("ongeldige waarde");

        }
    }

}
