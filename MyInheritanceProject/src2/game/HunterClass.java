package game;

public class HunterClass extends Character{

    public HunterClass(String name, int hitPoints, boolean isDead, Weapon myWeapon) {
        super(name, hitPoints, isDead, myWeapon);
    }

    @Override
    public void talk() {
        System.out.println("Let loose the hounds of war!");
    }

    @Override
    public void death() {
        System.out.println("AAArgggh!!! I will return! " + this.getName() +" has died! ");
    }
}
