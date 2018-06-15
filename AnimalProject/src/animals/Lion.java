package animals;

public class Lion extends Cat{
    private int power;

    public Lion(String inputName){
        super(inputName);
    }

    @Override
    public void sound(){
        System.out.println("Rooaar!!!");
    }

    public void rule(){
        System.out.println("Hail to the king Baby!");
    }
}
