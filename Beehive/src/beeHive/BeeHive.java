package beeHive;

public class BeeHive {
    public static void main(String[] args) {
        Worker maja = new Worker(100,10);
        maja.gatherNectar();

        Worker willy = new Worker(50,0);
        willy.gatherNectar();

        Soldier Boris = new Soldier();
        Boris.name = "Boris";

        Soldier Jan = new Soldier();
        Jan.name = "Jan";

        Boris.attack(Jan);
    }
}
