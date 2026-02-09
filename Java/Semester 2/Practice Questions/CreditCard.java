public class CreditCard
{
   public String cardNumber;
   
   public CreditCard(String c)
   {
      this.cardNumber = c;
   }
   
   public boolean isValid()
   {
      boolean valid;
      
      if(cardNumber.length() == 16)
      {
         valid = true;
      }
      else
      {
         valid = false;
      }
      return valid;
   }
}

class Main
{
public static void main(String[] args)
   {
      CreditCard c1 = new CreditCard("4782942728402174");
      CreditCard c2 = new CreditCard("737292823310");
      CreditCard c3 = new CreditCard("3738301347314424");
      
      System.out.println("Card is valid?: " + c1.isValid());
      System.out.println("Card is valid?: " + c2.isValid());
      System.out.println("Card is valid?: " + c3.isValid());
   }
}