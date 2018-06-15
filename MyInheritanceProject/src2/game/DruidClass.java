package game;

public class DruidClass extends Character {


    public DruidClass(String name, int hitPoints, boolean isDead, Weapon myWeapon) {
        super(name, hitPoints, isDead, myWeapon);
    }

    @Override
    public void talk() {
        System.out.println("Bear form!");
    }

    @Override
    public void death() {
        System.out.println("AAArgggh!!! Nature take you!" + this.getName() +" has died! ");

    }
}
