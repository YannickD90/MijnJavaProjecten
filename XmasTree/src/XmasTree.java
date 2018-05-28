public class XmasTree {
    public static void main(String[] args) {
        //this program prints a xmastree out of stars ***
        /*
             *
            ***
           *****
          *******
         *********
        ***********
             *
             *

         */

        int spacesCounter = 5;
        int starCounter = 1;
        boolean flag = false;

        for (int i = 0;i < 6;i++){

            for (int x = 0; x < 12; x++){
                if(x < spacesCounter){
                    System.out.print(' ');
                }
                else if (flag == true){
                    System.out.print(' ');
                }

                else{
                    flag = false;
                    for (int y = 0; y < starCounter; y++){
                        System.out.print('*');
                    }
                    flag = true;
                }

            }
            flag = false;
            System.out.print('\n');
            if (spacesCounter != 0 ){
                spacesCounter = spacesCounter -1;
            }

            starCounter = starCounter + 2;

        }

        for (int z = 0;z < 2;z++){
            for (int w = 0;w < 5;w++){
                System.out.print(' ');
            }
            System.out.println("*");

        }

    }
}
