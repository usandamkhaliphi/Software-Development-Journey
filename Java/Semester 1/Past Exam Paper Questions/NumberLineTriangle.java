import javax.swing.JOptionPane;

public class NumberLineTriangle 
{
    public static void main(String[] args) 
    {
        
        int input;
        int base; 

        input = Integer.parseInt(JOptionPane.showInputDialog("Input base of triangle"));
        base = input;

        System.out.println("You have entered the base of " + base);

      
        for (int row = 1; row <= base; row++) 
        {
            for (int num = 1; num <= row; num++) 
            {
                System.out.print(num);
            }
            System.out.println();  
        }
    }
}