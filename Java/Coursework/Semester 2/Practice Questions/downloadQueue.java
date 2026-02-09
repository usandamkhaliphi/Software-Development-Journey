import java.util.LinkedList;
import java.util.Queue;
public class downloadQueue
{
public static void main(String[] args)
   {
      Queue q1 = new LinkedList();
      
      q1.add("Facebook");
      q1.add("Instagram");
      q1.add("TikTok");
      q1.add("X");
      
      q1.remove();
      q1.remove();
      
      System.out.println("Queue: " + q1);
   }
}