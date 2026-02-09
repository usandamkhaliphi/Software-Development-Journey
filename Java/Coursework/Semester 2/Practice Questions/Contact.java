import java.util.HashMap;
public class Contact
{
   public String name;
   public String phoneNumber;

   public Contact(String n, String p)
   {
      this.name = n;
      this.phoneNumber = p;
   }
}
class Main
{
public static void main(String[] args)
   {
      HashMap<String, String> Contacts = new HashMap<>();
      
      Contacts.put("John", "0821234567");
      Contacts.put("Peter", "0847201842");
      Contacts.put("Samuel", "0838210347");
      Contacts.put("Mike", "0818072058");
      Contacts.put("Tim", "0729418432");
      
      String getC1 = Contacts.get("John");
      System.out.println("John's Phone Number: " + getC1);
      
      String getC2 = Contacts.get("Peter");
      System.out.println("Peter's Phone Number: " + getC2);
      
      String getC3 = Contacts.get("Samuel");
      System.out.println("Samuel's Phone Number: " + getC3);
      
      String getC4 = Contacts.get("Mike");
      System.out.println("Mike's Phone Number: " + getC4);
   
      String getC5 = Contacts.get("Tim");
      System.out.println("Tim's Phone Number: " + getC5);
   
   }
}