import org.junit.Assert;
import org.junit.Test;


public class TestFraction {

    public static void main(String[] args) {

    }

    @Test
    public void omkeringMoetTellerEnNoemerOmdraaien(){
        boolean out = false;
        Fraction test = new Fraction(5,10);
        test.omKering();
        if(test.getTeller() != 10 && test.getNoemer() != 5) {
            Assert.assertTrue("Het is niet succesvol omgedraaid", out);
        }


    }

    


}
