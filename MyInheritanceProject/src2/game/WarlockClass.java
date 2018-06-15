package game;

public class WarlockClass extends Character {


    public WarlockClass(String name, int hitPoints, boolean isDead, Weapon myWeapon) {
        super(name, hitPoints, isDead, myWeapon);
    }



    @Override
    public void talk() {
        System.out.println("UNLIMITED POOWAAAAAHHHHH!!!!");
    }

    @Override
    public void death(){
        System.out.println("AAArgggh!!! You fools! You do not know what you have done!! " + this.getName() +" has died! ");

    }
}
