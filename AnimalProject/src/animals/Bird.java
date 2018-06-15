package animals;

public class Bird extends Animal{

    public Bird(String inputName){
        super(inputName);
    }

    @Override
    public void sound(){
        System.out.println("Chirp!");
    }

    public void fly(){
        System.out.println("floop! floop!");
    }


}
