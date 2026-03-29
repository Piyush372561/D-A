import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        System.out.println("Element at index 2 : "+linkedlist.get(2));
        linkedlist.addFirst(0);
        linkedlist.addLast(5);
        System.out.println("Element at index 2 after adding elements: "+linkedlist.get(2));

        System.out.println(linkedlist);
        System.out.println("First element of the linkedlist : "+linkedlist.getFirst());
        System.out.println("First element of the linkedlist : "+linkedlist.getLast());

        //remove function in LinkedList
        linkedlist.removeIf(x -> x%2 == 0);
        System.out.println("List after removing even numbers: "+linkedlist);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Parrot", "Dog", "Cat", "Cow", "Tiger", "Elephant"));
        LinkedList<String> animalsremoved = new LinkedList<>(Arrays.asList("Dog", "Cat"));
        animals.removeAll(animalsremoved);
        System.out.println(animals);



    }
}
