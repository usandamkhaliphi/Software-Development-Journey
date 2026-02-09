import javax.swing.JOptionPane;

public class Display1
{
    public static void main(String[] args) 
    {
        
        String[] names = new String[5];
        
      
        for (int i = 0; i < 5; i++) 
        {
            names[i] = JOptionPane.showInputDialog("Enter name " + (i + 1));
        }
        
        
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        }

        System.exit(0); 
    }
}
