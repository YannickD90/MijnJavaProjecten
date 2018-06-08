package beeHive;

import java.util.Random;

public class Soldier extends Bee{

    //*************constructors************

    public Soldier(){

    }

    public Soldier(String nameInput,int hpInput){
        super(nameInput);
        this.hitpoints = hpInput;

    }

    //****************MEMBERS*************


    private String weapon;
    private int hitpoints = 100;    private int armour;
    private boolean isDead = false;
    private boolean inCombat = false;
    private Soldier enemy;

    //**************METHODS****************

    //defend method
    public void defend(){
        System.out.println("striking back");
        if(this.isDead != true && enemy.isDead != true){
            System.out.println("Angarde!!");
            enemy.takeDamage(this.random());
        }
    }

    @Override
    public void fly(){
        System.out.println("This soldier Bee is flying supersonic!");
    }

    //attack method
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

    //deals with damage taken
    public void takeDamage(int hp){
        this.hitpoints -= hp;
        System.out.println("AArrgh! " + this.getName() + " took " + hp + " damage!");

        if(this.hitpoints <= 0){
            System.out.println("Oh no! " + this.getName() + " is dead!");
            this.isDead = true;
        }
    }

    //calculate a random number
    public int random(){
        Random generator = new Random(System.nanoTime());
        return generator.nextInt(10);

    }

    //************** setters and getters *******************

    public  int getHitpoints(){
        return hitpoints;
    }

    public  void setHitpoints(int hp){
        this.hitpoints = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isInCombat() {
        return inCombat;
    }

    public void setInCombat(boolean inCombat) {
        this.inCombat = inCombat;
    }

    public Soldier getEnemy() {
        return enemy;
    }

    public void setEnemy(Soldier enemy) {
        this.enemy = enemy;
    }


}
