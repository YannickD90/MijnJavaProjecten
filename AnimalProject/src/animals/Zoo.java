package animals;

public class Zoo {
    public static void main(String[] args) {
        //dit is een zoo

        Animal[] zoo= new Animal[10];

        zoo[0] = new Dog("Josje");
        zoo[1] = new Dog("blackie");
        zoo[2] = new Cat("hubert");
        zoo[3] = new Rabbit("loppie");
        zoo[4] = new Lion("muisie");

        zoo[5] = new Dog("roeper");
        zoo[6] = new Cat("herbert");
        zoo[7] = new Rabbit("hilaar");
        zoo[8] = new Lion("cornelius");
        zoo[9] = new Cat("toon");

        for(Animal g : zoo){
            g.sound();
        }

        if(zoo[1] instanceof Dog) {
            ((Dog) zoo[1]).bite(); // !!!
        }

    }

}
