import java.util.ArrayList;
import java.util.List;


class Mycomparator implements Comparator<Integer> {
 
    @Override
    public int compare(Integer i1, Integer i2){
        return i1 - i2;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Comparator is an Interface jiski help se hum costum ordering kr skte hai.");

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println("Original order of the list: "+list);
        list.sort(new Mycomparator());
        System.out.println("New list = "+list);



    }
}
