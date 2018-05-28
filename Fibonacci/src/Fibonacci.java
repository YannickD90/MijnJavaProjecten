public class Fibonacci {
    public static void main(String[] args) {
        // this gives 20 fibonacci numbers
        //0 1 1 2 3 5 ...
        int fib = 1;
        int fibnew = 0;
        boolean flag = true;
        boolean once = true;

        for(int i = 0;i < 20; i++){

            if (once){
                System.out.println("0");
                System.out.println("1");
                once = false;
            }


            if(flag) {
                fibnew = fib + fibnew;
                System.out.println(fibnew);
                flag = false;
            }
            else{
                fib = fib + fibnew;
                System.out.println(fib);
                flag = true;

            }

        }

    }
}
