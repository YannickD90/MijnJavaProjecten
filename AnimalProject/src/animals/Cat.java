package animals;

public class Cat extends Animal{

    private int lives;

    public Cat(String inputName){
        super(inputName);
    }

    @Override
    public void sound(){
        System.out.println("Miouw");
    }

    public void scratch(){
        System.out.println("Scratch!");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


}
