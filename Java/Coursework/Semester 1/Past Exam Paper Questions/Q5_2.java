import javax.swing.JOptionPane;

public class Q5_2
{
    public static void main(String[] args)
    {
        String firstName = "";
        String markInput = "";
        int mark = 0;

        firstName = JOptionPane.showInputDialog("Enter the first name for student (or '@@' to stop)");

        while (!firstName.equals("@@"))
        {
            markInput = JOptionPane.showInputDialog("Enter the mark for " + firstName + " (or '-111' to stop)");

            if (markInput.equals("-111"))
            {
               
                firstName = JOptionPane.showInputDialog("Enter the first name for student (or '@@' to stop)");
            }
            else
            {
                
                mark = Integer.parseInt(markInput); 
                System.out.println(firstName + " " + mark);
                JOptionPane.showMessageDialog(null, firstName + " " + mark);
                firstName = JOptionPane.showInputDialog("Enter the first name for student (or '@@' to stop)");
            }
        }

        JOptionPane.showMessageDialog(null, "Student data entry complete.");
    }
}