import javax.swing.JOptionPane;

public class Mark
{
    public static void main(String[] args)
    {
        
        for (int i = 1; i <= 25; i++)
        {
            String firstName;
            int mark;
            
            firstName = JOptionPane.showInputDialog("Enter the first name for student " + i);
            mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the mark for " + firstName));
            

            
            System.out.println(firstName + " " + mark);
        }

        JOptionPane.showMessageDialog(null, "Data entry for all 25 students complete.");
    }
}
