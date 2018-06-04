package beeHive;

import java.util.Random;

public class Soldier {



    String name;
    String weapon;
    private int hitpoints = 100;
    int armour;
    private boolean isDead = false;
    private boolean inCombat = false;
    private Soldier enemy;

    public void defend(){
        System.out.println("striking back");
        if(this.isDead != true && enemy.isDead != true){
            System.out.println("Angarde!!");
            enemy.takeDamage(this.random());
        }
    }

    public void attack(Soldier defender){
        System.out.println("Combat!!!!!");
        defender.enemy = this;

        while(this.isDead != true && defender.isDead != true){
            System.out.println("En passant!");

            defender.takeDamage(this.random());
            defender.inCombat = true;
            this.inCombat = true;
            if(defender.isDead != true){
                defender.defend();
            }
        }

        defender.inCombat = false;
        this.inCombat = false;

    }


    public  int getHitpoints(){
        return hitpoints;
    }

    public  void setHitpoints(int hp){
        this.hitpoints = hp;
    }


    public void takeDamage(int hp){
        this.hitpoints -= hp;
        System.out.println("AArrgh! " + this.name + " took " + hp + " damage!");

        if(this.hitpoints <= 0){
            System.out.println("Oh no! " + this.name + " is dead!");
            this.isDead = true;
        }
    }

    public int random(){
        Random generator = new Random(System.nanoTime());
        return generator.nextInt(10);

    }
}
