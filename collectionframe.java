import java.util.ArrayList;
public class collectionframe {
    public static void main(String[] args) {
            System.out.println("Collection Framework:");
            //ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println("ArrayList: " + list);

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
            list2.add(5);
            System.out.println("ArrayList: " + list);
            

            list.addAll(list2);
            System.out.println("After adding all elements: " + list);

            list.size();
            System.out.println("Size of the list: " + list.size());

            //list.clear();
            //System.out.println("After clearing the list: " + list);

            list.isEmpty();
            System.out.println("Is the list empty? " + list.isEmpty());

            list.add(1);
            System.out.println("After adding an element: " + list);

            list2.remove(2);
            System.out.println("After removing an element: " + list2);

            list2.add(2,9);
            System.out.println("After adding an element at index 2: " + list2);

            list2.get(0);
            System.out.println("Element at index 0: " + list2.get(0));

            System.out.println("Size of list2: " + list2.size());

            //iteration using pointer
            for(int i = 0; i < list2.size(); i++){
                System.out.print(list2.get(i) + " ");
            }
                System.out.println();
            //iteration over list
            for(int x : list){
                System.out.print(x + " ");
            }

            // we check existence of an element using contains method
            System.out.println("\nDoes list contain 3? " + list.contains(3));

            
    }
}
