public class TelltotHonderd {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0;i < 100; i++){
            if (i > 0){
                i = i - 1;
            }
            while (x != 10){
                System.out.print(i + " ");
                x++;
                i++;
                if(i == 100){
                    break;
                }
            }
            System.out.println(i);
            x =0;

        }

    }
}
