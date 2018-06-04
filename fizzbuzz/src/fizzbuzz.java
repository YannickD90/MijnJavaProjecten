public class fizzbuzz {
    public static void main(String[] args) {
        //do fizzbuzz
        //multiple of 3 and multiple of 5 fizz on 3 buzz on 5 fizzbuzz on 15

        for(int i = 1;i < 100;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZBUZZ");
            }
            else if (i % 3 ==0){
                System.out.println("FIZZ");
            }else if (i % 5 == 0){
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
