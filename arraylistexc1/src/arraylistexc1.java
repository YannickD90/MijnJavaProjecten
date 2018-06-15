import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylistexc1 {

    public static void main(String[] args) {
        //make an array list and remove every firt j from a name
        ArrayList<String> names = new ArrayList();
        names.add("Jimi");
        names.add("janis");
        names.add("Amy");
        names.add("Kurt");
        names.add("jim");


  for (int i = 0; i < names.size();i++)
  {

      System.out.println(names.get(i).toUpperCase());
  }



        Iterator<String> namelistIterator = names.listIterator();
        while (namelistIterator.hasNext()) {
            if(namelistIterator.next().startsWith("J")) {
                namelistIterator.remove();
            }else{
                System.out.println(namelistIterator.next());
            }

        }


    }


}
