package game;

public class Main {
    public static void main(String[] args) {

        Weapon axe = new Weapon("Axe",10,15,"Axe Strike!");
        Character john = new WarriorClass("John",100,false,axe);
        Weapon staff = new Weapon("Staff",20,25,"Fire Ball!");
        Character brian = new WizardClass("Brian",70,false,staff);

        brian.attack(john);


        Weapon deathBringer = new Weapon("DeathBringer",500,35,"BOOOOOOM!");
        Character juno = new WarlockClass("Juno",50,false, deathBringer);

        if(brian.getHitPoints() > 0){
            juno.attack(brian);
        }


    }
}
