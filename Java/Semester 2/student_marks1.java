import javax.swing.JOptionPane;

public class student_marks1
{
public static void main(String[] args)
   {
      String [] Students = new String [10];
      int [] marks = new int [10];
      
      
      for(int counter = 0; counter <= 1; counter = counter + 1)
      {
         Students[counter] = JOptionPane.showInputDialog("Enter Name");
      }   
      
      
      for(int counter = 0; counter <= 1; counter++)
      {
         marks[counter] = Integer.parseInt(JOptionPane.showInputDialog("Enter mark"));
      }
      
      for(int counter = 0; counter <= 1; counter++)
      {
         System.out.println(Students[counter] +  " " + marks[counter]);
      }
}
}