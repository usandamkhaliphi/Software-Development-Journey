public class multiples
{
public static void main(String[] args)
   {
   
   for (int i = 0;i <= 50; i++)
      {
      System.out.print(i);
      
      if (((i % 4) == 0) && ((i % 5) == 0))
         
         {
         System.out.println(" Multiples of 4 and 5");
         }
            else 
            {
            System.out.println();
            }
      }
   } 
}