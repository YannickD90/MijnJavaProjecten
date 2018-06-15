package game;

public abstract class Character implements Combat{

    private  String name;
    private int HitPoints;
    private boolean isDead;
    private String classtype;
    private String race;
    private String sex;
    private Weapon myWeapon;
    private Character enemy;
    private int baseDamage = 10;

    public abstract void talk();
    public abstract void death();

    // ******************* CONSTRUCTORS  ************************

    public Character(String name, int hitPoints, boolean isDead, Weapon myWeapon) {
        this.name = name;
        HitPoints = hitPoints;
        this.isDead = isDead;
        this.myWeapon = myWeapon;
    }


    public int calculateDamage(int baseDamage , int weaponDamage){
        return baseDamage + RandomGenerator.randomInt(baseDamage + weaponDamage);
    }



    // ******************* METHODS *************************

    public Character getEnemy() {
        return enemy;
    }

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return HitPoints;
    }

    public void setHitPoints(int hitPoints) {
        HitPoints = hitPoints;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Weapon getMyWeapon() {
        return myWeapon;
    }

    public void setMyWeapon(Weapon myWeapon) {
        this.myWeapon = myWeapon;
    }




    @Override
    public void attack(Character target) {
        System.out.println(this.getMyWeapon().getSound());
        int damage = this.calculateDamage(this.getBaseDamage(),this.getMyWeapon().getWeaponDamage());
        this.setEnemy(target); //remember who I'm attacking
        target.setEnemy(this); //let the enemy know I'm attacking it
        target.defend(this,damage);//activate the enemy's defense method
    }

    @Override
    public void defend(Character attacker,int damage) {
        System.out.println("Shield!");
        this.setEnemy(attacker);
        this.setHitPoints(this.getHitPoints() - damage);
        if(this.getHitPoints() > 0){
            this.attack(this.getEnemy());
        }else{
            this.setDead(true);
            this.death();

        }
    }

}
