package animals;

import javax.swing.plaf.basic.BasicMenuItemUI;

public class Dog extends Animal {

    private String[] tricks;

    public Dog(String inputName){
        super(inputName);
    }

    @Override
    public void sound(){
        System.out.println("Woof!");
    }

    public  void bite(){
        System.out.println("Bite!");
    }

    public String[] getTricks() {
        return tricks;
    }

    public void setTricks(String[] tricks) {
        this.tricks = tricks;
    }

}
