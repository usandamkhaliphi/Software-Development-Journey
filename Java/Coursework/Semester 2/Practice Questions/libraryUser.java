public class libraryUser
{
   public String name;
   public int overdueDays;
   
   public libraryUser(String n, int o)
   {
      this.name = n;
      this.overdueDays = o;
   }
   
   public double calculateFine(double ratePerDay)
   {
      double fine = overdueDays * ratePerDay;
      return fine;
   }
}

class Main
{
public static void main(String[] args)
   {
      libraryUser l1 = new libraryUser("John",4);
      libraryUser l2 = new libraryUser("Peter",9);
      libraryUser l3 = new libraryUser("Sean",3);
      
      System.out.println("Name: " + l1.name + " Fine: R" + l1.calculateFine(35.50));
      System.out.println("Name: " + l2.name + " Fine: R" + l2.calculateFine(35.50));
      System.out.println("Name: " + l3.name + " Fine: R" + l3.calculateFine(35.50));
   }
}