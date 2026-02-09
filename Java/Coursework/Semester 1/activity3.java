import javax.swing.JOptionPane;

public class activity3 
{

    public static void main(String[] args) 
    {
    
    int num1; 
    int num2;
    int num3;
    int temp;
    
    num1 = 10;
    num2 = 20;
    num3 = 35;
    temp = num1;
    
    num1 = num2;
    num2 = num3;
    num3 = temp;
    
    JOptionPane.showMessageDialog(null,num1);
    JOptionPane.showMessageDialog(null,num2);
    JOptionPane.showMessageDialog(null,num3);
    
    System.exit(0);
    }
}
    