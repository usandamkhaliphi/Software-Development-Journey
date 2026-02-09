import java.util.LinkedList;
public class toDoList
{
public static void main(String[] args)
   {
      LinkedList list = new LinkedList();
      
      list.add("Make Breakfast");
      list.add("Feed pets");
      list.add("Wash Car");
      list.add("Buy Groceries");
      list.add("Put Groceries away");
      
      list.remove(1);
      
      System.out.println("List: " + list);
   }
}