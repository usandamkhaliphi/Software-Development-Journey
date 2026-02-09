import java.util.*;
public class list
{
public static void main(String[] args)
   {
      // create a LinkedList
      LinkedList mylist = new LinkedList();
      
      // add elements to the Linked List
      mylist.add(100);
      mylist.addLast(50);
      mylist.add(1,52);
      
      System.out.println("LinkedList: " + mylist);
      
      mylist.remove(2);
      mylist.removeFirst();
      mylist.removeLast();
      
      System.out.println("LinkedList: " + mylist);
   }
}