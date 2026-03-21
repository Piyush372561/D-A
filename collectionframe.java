import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

            // Ways to create an ArrayList
            //1. Default constructor creates an empty list with initial capacity of 10
            ArrayList<String> Names = new ArrayList<>();
            Names.add("Piyush");
            Names.add("Lakshya");
            Names.add("Vaishnavi");
            Names.add("Daksh");
            Names.add("Vishal");
            System.out.println(Names.getClass().getName());

            //2. Constructor with initial capacity creates an empty list with specified initial capacity
            ArrayList<String> ListWithCapacity = new ArrayList<>(5);
            System.out.println(ListWithCapacity.getClass().getName());

            //3. Constructor with another collection creates a list with the same elements as the specified collection
            ArrayList<String> AnotherList = new ArrayList<>(Names);
            System.out.println(AnotherList);
            System.out.println(AnotherList.getClass().getName());

            //4. Using Arrays.asList() method creates a fixed-size list backed by the specified array
            // We can not add or remove elements from this list, but we can modify existing elements.
            // Arrays.asList() method returns a fixed size list backed by the specified array. This means that the list is not resizable, and any attempt to add or remove elements from the list will throw an UnsupportedOperationException. However, we can modify existing elements in the list using the set() method.
            List<String> ListFromArray = Arrays.asList("Piyush", "Lakshya", "Vaishnavi", "Daksh", "Vishal");
            System.out.println(ListFromArray.getClass().getName());
            ListFromArray.set(0, "Love");
            System.out.println(ListFromArray);

            String[] array = {"Mangoshake", "Strawberry Milkshake", "Chocolate Milkshake"};
            List<String> ListFromArray2 = Arrays.asList(array);
            System.out.println(ListFromArray2.getClass().getName());

            //5. Using List.of() method creates an immutable list containing the specified elements
            // List.of() method returns an immutable list containing the specified elements. This means that the list cannot be modified after it is created, and any attempt to add, remove, or modify elements in the list will throw an UnsupportedOperationException.
            List<Integer> ImmutableList = List.of(1, 2, 3, 4, 5);
            System.out.println(ImmutableList.getClass().getName());
 
            // To create a mutable list from an immutable list, we can use the ArrayList constructor that takes a collection as an argument. This allows us to create a new ArrayList that contains the same elements as the immutable list, but can be modified as needed.
            List<String> List4 = new ArrayList<>(ListFromArray2);
            List4.add("Vanilla Milkshake");
            System.out.println(List4);
            System.out.println(List4.getClass().getName());

            // We can also create a mutable list from an immutable list using the addAll() method. This allows us to add all the elements from the immutable list to a new mutable list, which can then be modified as needed.
            List<Integer> list5 = new ArrayList<>();
            list5.add(1);
            list5.add(2);
            list5.add(3);
            list5.add(4);
            list5.add(5);

            List<Integer> List6 = List.of(6,7,8,9,10);
            list5.addAll(List6);
            System.out.println(list5);

            //
            List<Integer> list7 = new ArrayList<>();
            list7.add(1);
            list7.add(2);
            list7.add(3);

            // removes the element at index 1 not the element with value 1
            list7.remove(1);
                System.out.println(list7);

             List<String> list8 = new ArrayList<>();
             list8.add("Apple");
             list8.add("Apple");
             list8.add("Banana");
             list8.add("Cherry");

             // removes the first occurrence of "Apple" from the list, not all occurrences
             list8.remove("Apple");
                System.out.println(list8);
    }
}
