import java.util.Stack;

public class Software
{
public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.push("iOS 26.0");
      s1.push("iPadOS 26.0");
      s1.push("WatchOS 26.0");
      s1.pop();
      System.out.println("Stack: " + s1);
   }
}