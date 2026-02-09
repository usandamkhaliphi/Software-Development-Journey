public class LibraryBook
{
   public String title;
   public boolean isAvailible;
   
   public LibraryBook(String t, boolean a)
   {
      this.title = t;
      this.isAvailible = a;
   }
   
   public boolean issueBook()
   {
      isAvailible = false;
      return isAvailible;
   }
   
   public boolean returnBook()
   {
      isAvailible = true;
      return isAvailible;
   }
}

class Main
{
public static void main(String[] args)
   {
      LibraryBook l1 = new LibraryBook("Harry Potter",true);
      
      System.out.println("Book is availible?: " + l1.issueBook());
   }
}