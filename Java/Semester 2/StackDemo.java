import java.util.Stack;
public class StackDemo
{
public static void main(String[] args)
   {
      Stack st = new Stack();
      
      st.push("Fundamentals");
      st.push("of");
      st.push("Programming");
      st.pop();
      
      System.out.println("Stack: " + st);
   }
}