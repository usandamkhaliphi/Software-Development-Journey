import java.util.Queue;
import java.util.LinkedList;
public class Queue_demo
{
public static void main(String[] args)
   {
      Queue Q1 = new LinkedList();
      
      Q1.add("Fundamentals");
      Q1.add("of");
      Q1.add("Programming");
      Q1.remove();
      
      System.out.println("Queue : " + Q1);
   }
}