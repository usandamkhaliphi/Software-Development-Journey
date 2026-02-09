public class productPrice
{
public static void main(String[] args)
   {
     
      double[] price = new double[6];
      
      price[0] = 57.99;
      price[1] = 599.99;
      price[2] = 429.99;
      price[3] = 339.95;
      price[4] = 7299.99;
      price[5] = 579.99;
      
      for (int counter = 0; counter <= 5; counter++)
      {
         if (price[counter] >= 200 && price[counter] < 1000)
         {
            System.out.println(price[counter]);
         }
      }
   }
}