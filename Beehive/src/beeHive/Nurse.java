package beeHive;

public class Nurse extends Bee {

    private int energy;
    private int patience;

    public boolean nurseLarva(Larva l){
        this.energy --;
        this.patience -= 10;
        l.size += 2;
        if(l.isFullyGrown()){
            return l.hatch();

        }else{
            return false;
        }
    }

    //GETTERS AND SETTERS

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getPatience() {
        return patience;
    }

    public void setPatience(int patience) {
        this.patience = patience;
    }


}
