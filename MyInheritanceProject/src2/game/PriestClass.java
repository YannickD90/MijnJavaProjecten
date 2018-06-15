package game;

public class PriestClass extends Character {


    public PriestClass(String name, int hitPoints, boolean isDead, Weapon myWeapon) {
        super(name, hitPoints, isDead, myWeapon);
    }

    @Override
    public void talk() {
        System.out.println("Let the light heal you!");
    }

    @Override
    public void death() {
        System.out.println("I go towards the light!" + this.getName() +" has died! ");
    }
}
