package testpackage;


public class PrimesTest {
    public static void main(String[] args) {
        boolean out = Primes.isPrime(7);
        if(out != true){
            System.out.println("fout");
        }else{
            System.out.println("ok");
        }
    }
}
