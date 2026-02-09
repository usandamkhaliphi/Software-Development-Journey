import java.util.LinkedList;
class Bookstore
{
   public String storeName;
   public String titles;
   
   public void addBook(String title)
   {
      
   }
   
   public void removeBook(String title)
   {
      
   } 

   Bookstore book = new Bookstore();

}

public class Books
{
public static void main(String[] args)
   {
      LinkedList titles = new LinkedList();
   
      titles.add("Harry Potter");
      titles.add("It ends with us");
      titles.add("The midnight Library");
      titles.add("The silent Patient");
      titles.remove();
      
      System.out.println(titles);
   }
}