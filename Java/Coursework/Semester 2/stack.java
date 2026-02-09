import java.util.Stack;
public class stack
{
public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.push("Sandra");
      s1.push(15);
      s1.push(200);
      s1.push('#');
      s1.pop();
      
      System.out.println("Stack: " + s1);
      System.out.println(s1.peek());
      
      s1.push("Mary");
      System.out.println("Stack: " + s1);
   }
}
      