import java.util.Stack;
public class Stacking
{
public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.add(243);
      System.out.println("Stack: " + s1);
      s1.add(732);
      System.out.println("Stack: " + s1);
      s1.add(932);
      System.out.println("Stack: " + s1);
      s1.add(253);
      System.out.println("Stack: " + s1);
      s1.add(281);
      System.out.println("Stack: " + s1);
      s1.pop();
      System.out.println("Stack: " + s1);
      s1.pop();
      System.out.println("Stack: " + s1);
      
   }
}