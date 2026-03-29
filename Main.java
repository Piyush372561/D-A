import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{

    private String name;

    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name ;}
    public double getGpa() { return gpa; }
}

class stringLengthcomparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2){
        return o1.length() - o2.length();
      //  return o2.length() - o1.length();
    }
}


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

        /* List<String> list1 = new ArrayList<>();
        list1.add("Ajay");
        list1.add("Seema");
        list1.add("Piyush");
        list1.add("Lakshya"); */
        List<String> list1 = Arrays.asList("Piyush", "Lakshya", "Mahesh", "Seema", "Ajay");
        list1.sort(new stringLengthcomparator());
        System.out.println("List1 = "+list1);

        //lambda expression.
        List<String> lambda_E = Arrays.asList("Kushwaha", "Sharma", "Sahu");
        lambda_E.sort((a, b) -> a.length() - b.length());
        System.out.println(lambda_E);

        //
        List<Student> students = new ArrayList<>();
        students.add(new Student("Abhay", 3.5));
        students.add(new Student("vishal", 5.5));
        students.add(new Student("Piyush", 6.5));

    }
}
