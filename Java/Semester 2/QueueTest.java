import java.util.Queue;
import java.util.LinkedList;
public class QueueTest
{
public static void main(String[] args)
   {  
      Queue q1 = new LinkedList();
      q1.add(3*4);
      q1.add(7+8);
      q1.remove();
      System.out.println(q1); 
   }
}