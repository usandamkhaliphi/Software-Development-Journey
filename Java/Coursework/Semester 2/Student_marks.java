import javax.swing.JOptionPane;

public class Student_marks
{
public static void main(String[] args)
   {
      String [] students = new String [10];
      int [] marks = new int [10];
      
      for (int counter = 0; counter <= 9; counter++)
         {
            students[counter] = JOptionPane.showInputDialog("Enter Name");
         }
      
      for (int counter = 0; counter <= 9; counter++)
         {
            marks[counter] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
         }

      for (int counter = 0; counter <= 9; counter++)
         {
            System.out.println(students[counter] + " " + marks[counter]);
         }
      
      
    }
}