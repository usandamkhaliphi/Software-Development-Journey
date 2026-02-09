public class Book
{
   public String title;
   public String author;
   public boolean isBorrowed;
   
   public Book(String t, String a, boolean i)
   {
      this.title = t;
      this.author = a;
      this.isBorrowed = i;
   }
   
   public void borrowBook()
   {
      isBorrowed = true;
   }
   
   public void returnBook()
   {
      isBorrowed = false;
   }
}

class Main
{
public static void main(String[] args)
   {
      Book book1 = new Book("Harry Pottter","J.K Rowling",true);
      Book book2 = new Book("To Kill A Mockingbird","Harper Lee",true);
      Book book3 = new Book("The Fault In Our Stars","John Green",true);
      
      book1.borrowBook();
      book2.returnBook();
      
      System.out.println("Title: " + book1.title + "\n" + "Author: " + book1.author + "\n" + "Borrowed: " + book1.isBorrowed);
      System.out.println("Title: " + book2.title + "\n" + "Author: " + book2.author + "\n" + "Borrowed: " + book2.isBorrowed);
   }
}
      
      