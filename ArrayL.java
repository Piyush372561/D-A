import java.util.ArrayList;
public class ArrayL {
    public static void main(String[] args) {

        // Question-1 : Create an ArrayList of integers and add some numbers to it. Then, print the list.
         System.out.println("Array List no. 1");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(04);
        numbers.add(10);
        numbers.add(2005);
        System.out.println(" Numbers list : "+numbers);

        // Question-2 : Create an ArrayList of strings and add some names to it. Then, print the list.
         System.out.println("Array List no. 2");
        System.out.println(" Size of the list : "+numbers.size());

        // Question-4 : Create an ArrayList of strings and add some names to it. Then, update one of the names and print the updated list.
        System.out.println("Array List no. 3");
        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        str.add("Java");
        System.out.println(" String list : "+str);
        str.set(1, "Universe");
        System.out.println(" Updated string list : "+str);

        // Question-5 
        System.out.println("Array List no. 4");
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(2);
        AL.add(4);
        AL.add(6);
        AL.add(8);
        System.out.println(AL);
        System.out.println(AL.contains(11));


    }
}
