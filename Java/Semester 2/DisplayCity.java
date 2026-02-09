public class DisplayCity
{
public static void main(String[] args)
   {
      String[] city = new String [5];
      
      city[0] = "Durban";
      city[1] = "Johannesburg";
      city[2] = "Cape Town";
      city[3] = "Pinetown";
      city[4] = "Secunda";
      
      for(int counter = 0; counter <= 4; counter++)
      {
         System.out.println(city[counter]);
      }
   }
}