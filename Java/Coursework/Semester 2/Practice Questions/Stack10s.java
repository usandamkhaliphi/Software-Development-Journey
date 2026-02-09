import java.util.Stack;
public class Stack10s
{
public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.push(10);
      s1.push(20);
      s1.push(30);
      
      System.out.println("Stack: " + s1);
      
      s1.pop();
      
      System.out.println("Stack: " + s1);
      
      s1.pop();
      
      System.out.println("Stack: " + s1);

      s1.pop();
      
      System.out.println("Stack: " + s1);
   }
}