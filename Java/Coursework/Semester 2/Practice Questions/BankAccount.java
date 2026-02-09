import javax.swing.JOptionPane;

class Bank_Account 
{
    private String owner_Name;
    private double balance;

    public Bank_Account(String n, double b) 
    {
        this.owner_Name = JOptionPane.showInputDialog("Enter Name");
        this.balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance"));
    }

    public String GetOwner_Name() 
    {
        return owner_Name;
    }

    public void SetOwnerName(String n) 
    {
        this.owner_Name = n;
    }

    public void deposit() 
    { 
        double depositamount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount"));
        balance = balance + depositamount;
    }

    public void withdraw() 
    {
        double withdrawamount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount"));

        if (withdrawamount > balance) 
        {
            JOptionPane.showMessageDialog(null, "Insufficient funds.");
        } 
        
        else 
        
        {
            balance -= withdrawamount;
        }
    }

    public double getbalance() 
    { 
        return balance;
    }
}

public class BankAccount 
{
    public static void main(String[] args) 
    {
        Bank_Account account = new Bank_Account("", 0);

        account.deposit();
        account.withdraw();

        System.out.println("Name: " + account.GetOwner_Name() + "\nFinal Balance: " + account.getbalance());
    }
}
