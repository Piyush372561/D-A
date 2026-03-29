import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        System.out.println(linkedlist.get(2));
        linkedlist.addFirst(0);
        linkedlist.addLast(5);

        System.out.println(linkedlist);
    }
}
