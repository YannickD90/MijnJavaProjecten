package beeHive;

public class Bee {
    //superclass bee
    protected String name;


    //constructors
    public Bee(){

    }

    public Bee(String inputName){
        this.name = inputName;
    }


    //methods
    public void fly(){
        System.out.println("BBBzzzzzzz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
