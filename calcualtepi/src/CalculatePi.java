public class CalculatePi {
    public static void main(String[] args) {
        //this is a program that calculates pi

        int limit = 100000000;
        double memory = 1;
        boolean flag = true;

        for(double i = 3; i <= limit ; i+= 2){


            if(flag){
                memory = memory - (1/i);
                flag = false;


            }else{
                memory = memory + (1/i);
                flag = true;
            }

        }
        double output = memory * 4;
        System.out.println("pi is : " + output);
    }
}
