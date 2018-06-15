package game;

public class WizardClass extends Character {





    //*************** constructor ***********

    public WizardClass(String name, int hitPoints, boolean isDead, Weapon myWeapon) {
        super(name, hitPoints, isDead, myWeapon);
    }


    //*************** methods ***********



    @Override
    public void death() {
        System.out.println("Arrrrgh! " + this.getName() + " is now dead");
    }

    @Override
    public void talk() {
        System.out.println("Hello! I'm " + this.getName() );
    }


}
