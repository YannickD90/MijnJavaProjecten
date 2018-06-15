package game;

public class Weapon extends Gear{

    private int weaponDamage = 10;
    private String sound = " ";

    public Weapon(String gearName, int gearValue, int weaponDamage,String sound) {
        super(gearName, gearValue);
        this.weaponDamage = weaponDamage;
        this.sound = sound;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
