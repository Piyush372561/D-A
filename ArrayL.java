import java.util.ArrayList;
import java.util.Collections;
public class ArrayL {
    public static void main(String[] args) {

//Easy Level Questions 
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
        System.out.println(AL.contains(50));

 // Medium level Questions 

        //Question-6 : 
        ArrayList<Integer> Max_N = new ArrayList<>();
        Max_N.add(10);
        Max_N.add(20);
        Max_N.add(30);
        Max_N.add(40);
        int maxi = Max_N.get(0);
        for(int i = 0; i < Max_N.size(); i++) {
            if(Max_N.get(i) > maxi){
                maxi = Max_N.get(i);
        }
    }
    System.out.println("Maximum no.= "+maxi);

    //Question-7 :
    ArrayList<Integer> al = new ArrayList<>();
    al.add(2);
    al.add(4);
    al.add(6);
    al.add(8);
    int min = al.get(3);
    for (int i = al.size() - 1; i >=0; i--) {
        if (min > al.get(i)) {
            min = al.get(i);
        }
    }
    System.out.println("Minimum no.= "+min);

    //Question-8
    ArrayList<Integer> i = new ArrayList<>();
    i.add(1);
    i.add(2);
    i.add(3);
    i.add(4);
    i.add(5);
    int sum = 0;
    for(int n = 0; n <= i.size()-1; n++){
        sum = sum + i.get(n);
    }
    System.out.println("List is :"+i);
    System.out.println("Sum of a list is: "+sum);

    //Question-9 :Write a program to reverse an ArrayList
    ArrayList<Integer> Revnum = new ArrayList<>();
    Revnum.add(3);
    Revnum.add(6);
    Revnum.add(9);
    Revnum.add(12);
    
    System.out.println("Original List: "+Revnum);
    //Simple logic
    for(int p = Revnum.size()-1; p >=0; p--){
         System.out.print(Revnum.get(p)+ " ");
    }
    //Using collection method
    Collections.reverse(Revnum);
    System.out.println(Revnum);

    // The OG method
    int r = 0;
    int s = Revnum.size() - 1;
    
    while (r < s) { 
        int temp = Revnum.get(r);
        Revnum.set(r,Revnum.get(s));
        Revnum.set(s,temp);

        r++;
        s--;
    }
    System.out.print(Revnum);

    // Question-10
    ArrayList<Integer> Sort = new ArrayList<>();
    Sort.add(10);
    Sort.add(50);
    Sort.add(5);
    Sort.add(1);
    System.out.println("Unsorted List: "+Sort);
    Collections.sort(Sort);
    System.out.println("Sorted List: "+Sort);
    
//Good Logical Questions
 
    //Question - 11 : 
    ArrayList<Integer> Duplet = new ArrayList<>();
    Duplet.add(10);
    Duplet.add(20);
    Duplet.add(10);
    Duplet.add(20);
    Duplet.add(30);
    Duplet.add(30);
    Duplet.add(40);
    System.out.println(Duplet);
    Duplet.remove(10);
    Duplet.remove(20);
    Duplet.remove(30);
    System.out.print(Duplet);

    //Question-11
    ArrayList<Integer> Oglist = new ArrayList<>();
    ArrayList<Integer> newlist = new ArrayList<>();
    Oglist.add(10);
    Oglist.add(20);
    Oglist.add(20);
    Oglist.add(30);
    Oglist.add(40);
    Oglist.add(50);
    System.out.println("Oglist :"+Oglist);

    for (int k = 0; k < Oglist.size(); k++) {
        if (!newlist.contains(Oglist.get(k))) {
            newlist.add(Oglist.get(k));
        }
    }
    System.out.println(newlist);







    
  }
}
