import java.util.*;
import java.util.LinkedList;
public class Grocery
{
public static void main(String[] args)
   {
      LinkedList groceries = new LinkedList();
      
      groceries.add("bread");
      groceries.add("Milk");
      groceries.add("Eggs");
      groceries.add("Sugar");
      groceries.add("Juice");
      groceries.set(2, "Meat");
      
      System.out.println(groceries);
   }
}