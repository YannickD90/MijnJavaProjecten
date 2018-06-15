package game;

public abstract class Gear {
    private String gearName;
    private int gearValue;

    public Gear(String gearName, int gearValue) {
        this.gearName = gearName;
        this.gearValue = gearValue;
    }

    public String getGearName() {
        return gearName;
    }

    public void setGearName(String gearName) {
        this.gearName = gearName;
    }

    public int getGearValue() {
        return gearValue;
    }

    public void setGearValue(int gearValue) {
        this.gearValue = gearValue;
    }


}
