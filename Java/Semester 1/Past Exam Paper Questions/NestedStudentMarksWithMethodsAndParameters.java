import javax.swing.JOptionPane;

public class NestedStudentMarksWithMethodsAndParameters
{
    public static void main(String[] args)
    {
        int numberOfStudents;
        int numberOfModules;

        numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students"));
        numberOfModules = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of modules"));

        processMarks(numberOfStudents, numberOfModules);
    }

    public static void processMarks(int numberOfStudents, int numberOfModules)
    {
        for (int i = 1; i <= numberOfStudents; i++)
        {
            int totalMarks = 0;

            for (int j = 1; j <= numberOfModules; j++)
            {
                int studentMark = Integer.parseInt(JOptionPane.showInputDialog(
                        "Enter mark for Student " + i + ", Module " + j));
                totalMarks += studentMark;
            }

            double average = (double) totalMarks / numberOfModules;

            JOptionPane.showMessageDialog(null, "Student " + i + "'s Total Marks: " + totalMarks +
                    "\nAverage Mark: " + average);

            System.out.println("End Of Student " + i + "'s Academic Record");
        }
    }
}
