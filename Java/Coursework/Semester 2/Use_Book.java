class book 
{
   public String Book_name;
   public String Book_category;
   public int Reference_number;
   public int No_of_pages;
   
   public book()
   {
   }
   
   public book(String n, String c, int r, int p)
   {
   this.Book_name = n;
   this.Book_category = c;
   this.Reference_number = r;
   this.No_of_pages = p;
   }
}

public class Use_Book
{
public static void main(String[] args)
   {
      book B1 = new book("Informatics 1B","Programming",1001,87);
      book B2 = new book("Management Accounting","",1002,0);
 
      System.out.println("Book name = " + B1.Book_name + "\n" + "Category = " + B1.Book_category + "\n" + "Reference Number = " + B1.Reference_number + "\n" + "Number of pages = " + B1.No_of_pages);
      System.out.println("Book name = " + B2.Book_name + "\n" + "Reference Number = " + B2.Reference_number);
   }
}