import javax.swing.JOptionPane;

public class BankBalanceDoWhile 
{
    public static void main(String[] args) 
    {
        double investmentAmount;
        double balance;
        double interest;
        int userInput;

       
        investmentAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter an investment amount"));

        
        interest = investmentAmount * 0.07; 
        balance = investmentAmount + interest;

        do 
        {
            
            JOptionPane.showMessageDialog(null, "Your balance is R " + balance);

            userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to see your balance for the next year\nEnter 0 if you do not wish to see any further balances"));

          
            if (userInput == 1) 
            
            {
                balance = balance + (balance * 0.07); 
            }
            
            else if (userInput != 0 && userInput != 1) 
           
            {
                JOptionPane.showMessageDialog(null, "You have entered an invalid input\nEnter 1 to see your balance for the next year\nEnter 0 if you do not wish to see any further balances");
            }

        } 
        
        while (userInput != 0); 

      
        JOptionPane.showMessageDialog(null, "Thank you for using the bank balance calculator!");
        
        System.exit(0);
    }
}
