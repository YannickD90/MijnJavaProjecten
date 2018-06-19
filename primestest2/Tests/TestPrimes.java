import org.junit.Assert;
import org.junit.Test;
import primes.Primes;

public class TestPrimes {

    @Test
    public void primeNumberReturnsTrueIfValueIsPrime(){
        boolean out = Primes.isPrime(7);
        Assert.assertTrue(out);
    }

    @Test
    public void primeNumberReturnsTrueIfValueIsNotPrime(){
        boolean out = Primes.isPrime(6);
        Assert.assertFalse(out);
    }

    @Test
    public void oneIsNotAPrime(){
        boolean out = Primes.isPrime(1);
        Assert.assertFalse(out);
    }

    @Test
    public void negativeNumbersAreNotAllowed(){
        boolean out = Primes.isPrime(-5);
        Assert.assertFalse(out);

    }
}
