import java.util.Arrays;
import java.util.LinkedList;
public class pslinked_L {
    public static void main(String[] args){
          //Question-1
          LinkedList<Integer> ldl = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
          System.out.println(ldl.getFirst());
          System.out.println(ldl.getLast());

          System.out.println(ldl);
          
          //Question-2
          ldl.addFirst(0);
          ldl.addLast(7);
          ldl.add(3, 32);
          System.out.println(ldl);

          //Question-3
          ldl.removeFirst();
          ldl.removeLast();
          System.out.println(ldl);

          // Question-4 
          //checking if linkedlist contains this object or not 
          System.out.println(ldl.contains(32));
          //getting the index of the element
          System.out.println(ldl.indexOf(32));

          Node node1 = new Node();
          node1.previous = null;
          node1.value = 1;
          node1.next = node2;

          Node node2 = new Node();
          node2.previous = node1;
          node2.value = 2;
          node2.next = null;
          

        
    }
}

class Node{

    public Node previous;

    public int value;

    public Node next;
}
