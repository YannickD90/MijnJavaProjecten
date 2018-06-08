package beeHive;

public class Larva {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

   public boolean isFullyGrown(){
        return size >= 10;
   }

  public boolean hatch(){
      System.out.println("hatch");
      return true;
  }
}
