package beeHive;

public class Worker extends Bee {
    int capacity =10;
    int load=0;


    //constructor
    public Worker(int initialCapacity,int initialLoad){
        System.out.println("CONSTRUCTING");
        this.capacity = initialCapacity;
        this.load = initialLoad;
    }

    //constructor
    public Worker(){
        super("john doe");
        this.load =0;
        this.capacity = 100;

    }

    public void gatherNectar(){
        for (int i = 0; i < 10 && this.capacity > this.load; i++) {

            this.load +=5;
            System.out.println("visit next flower " + this.load + "/" + this.capacity);

        }
    }
}
