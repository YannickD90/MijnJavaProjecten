
package message;

import java.util.Scanner;

public class Message {
    public void Hello(){
        System.out.println("Hello User! Welcome to my awesome automaton!");
        System.out.println("Make a choice of what you want to do:");
        System.out.println("1. A + B \n" + "2. A - B \n" + "3. A * B \n" + "4. A / B \n" );
        Scanner inread1 = new Scanner(System.in);
        int userChoice = inread1.nextInt();

        switch(userChoice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

    }
}
