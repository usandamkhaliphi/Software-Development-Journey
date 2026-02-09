import java.util.Stack;
public class Character
{
public static void main(String[] args)
   {
      Stack character = new Stack();
      
      character.push("J");
      character.push("A");
      character.push("V");
      character.push("A");
      character.pop();
      
      System.out.println("Stack: " + character);
   }
}