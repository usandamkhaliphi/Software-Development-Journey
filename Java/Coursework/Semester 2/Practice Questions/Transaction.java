/*Original 

import java.util.LinkedList;
public class transaction
{
public static void main(String[] args)
   {
      LinkedList amount = new LinkedList();
      
      amount.add(8549.26);
      amount.add(328.23);
      amount.add(352.42);
      amount.add(953.92);
      amount.add(731.23);
      
      if (amount > 500)
      {
         System.out.println(amount);
      }
      
   }
}
*/

import java.util.LinkedList;

public class Transaction 
{
    public static void main(String[] args) 
    {
        LinkedList<Double> amount = new LinkedList<>();

        amount.add(8549.26);
        amount.add(328.23);
        amount.add(352.42);
        amount.add(953.92);
        amount.add(731.23);

        System.out.println("Transactions greater than 500:");

        for (Double amt : amount) 
        {
            if (amt > 500) 
            {
                System.out.println(amt);
            }
        }
    }
}
