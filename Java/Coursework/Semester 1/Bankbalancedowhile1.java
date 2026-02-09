import javax.swing.JOptionPane;

public class Bankbalancedowhile1
{
public static void main(String[] args)
   {
      double investmentammount;
      int userinput;
      double balance;
      double interest;
      
      investmentammount = Integer.parseInt(JOptionPane.showInputDialog("Enter an investment ammount"));
      
      interest = investmentammount * 0.5;
      balance = investmentammount + interest;
      
      do 
         {
            JOptionPane.showMessageDialog(null,"your balance is " + balance);
            
          userinput = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to see the balance for the next year\nEnter 0 if you do not wish to see any further balances"));
            
           if (userinput == 1)
            
            {
               balance = balance + (balance * 0.5);
            }
            
            else if (userinput != 1 && userinput != 0)
            {
               JOptionPane.showMessageDialog(null,"You have entered an invalid input.\nEnter 1 to see the balance for the next year\nEnter 0 if you do not wish to see any further balances");
            }
            
         }
        
        while (userinput != 0);
        
        JOptionPane.showMessageDialog(null,"Thank you for using the balance calculator");
        
        System.exit(0);
        
   }
}
            