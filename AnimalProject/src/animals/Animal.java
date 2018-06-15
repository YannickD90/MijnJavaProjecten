package animals;

public abstract class Animal {

    private String name;

    public Animal(String inputName){
        this.name = inputName;
    }

    public Animal(){

    }

    public abstract void sound();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
