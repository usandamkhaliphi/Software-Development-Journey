import java.util.Stack;

public class ShoppingCart
{
public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.push("USB C Cable");
      s1.push("Phone case");
      s1.push("T shirt");
      s1.push("Shorts");
      s1.pop();
      System.out.println("Stack: " + s1);
   }
}