import java.util.Stack;
public class Airline
{
public static void main(String[] args)
   {
      Stack s1 = new Stack();
      
      s1.push("John");
      s1.push("Peter");
      s1.push("Samuel");
      s1.push("Tom");
      s1.push("Tim");
      s1.pop();
      System.out.println("Stack: " + s1);
   }
}