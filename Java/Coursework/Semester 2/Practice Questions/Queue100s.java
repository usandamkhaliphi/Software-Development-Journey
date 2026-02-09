import java.util.Queue;
import java.util.LinkedList;

public class Queue100s
{
public static void main(String[] args)
   {
      Queue q1 = new LinkedList();
      
      q1.add(100);
      q1.add(200);
      q1.add(300);
      q1.add(400);
      q1.remove();
      q1.add(500);
      
      System.out.println("Queue: " + q1);
   }
}