package beeHive;

public class BeeHive {
    public static void main(String[] args) {
        Worker maja = new Worker(100,10);
        maja.gatherNectar();

        Worker willy = new Worker(50,0);
        willy.gatherNectar();

        Soldier Boris = new Soldier("Boris",100);


        Soldier Jan = new Soldier("Jan",100);

        Boris.attack(Jan);
        System.out.println(Boris.getName());

        Boris.fly();

    }
}
