package animals;

public class Rabbit extends Animal{

    private boolean fluffy;

    @Override
    public void sound() {
        System.out.println("miep!");
    }

    public Rabbit(String inputName){
        super(inputName);
    }

    public boolean isFluffy() {
        return fluffy;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }
}
