import java.util.Stack;

public class Act5_10
{
   public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.push(3*4);
      s1.push(7+8);
      s1.pop();
      s1.push(6*7);
      System.out.println("Peek: " + s1.peek());
      s1.pop();
      s1.push(9*3);
      
      System.out.println("Stack: " + s1);
   }
}