package game;

public class Armor extends Gear {

    public String armorType = null;
    int armorValue = 10;

    public Armor(String gearName, int gearValue, String armorType, int armorValue) {
        super(gearName, gearValue);
        this.armorType = armorType;
        this.armorValue = armorValue;
    }


}
