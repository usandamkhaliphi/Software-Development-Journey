public class ReportCard
{
   public String studentName;
   int[] marks = new int[5];
   
   public ReportCard(String s)
   {
      this.studentName = s;
      
      marks[0] = 84;
      marks[1] = 73;
      marks[2] = 13;
      marks[3] = 61;
      marks[4] = 91;
   }
   public double getAverage()
   {
      double average = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
      return average;
   }
}

class Main
{
public static void main(String[] args)
   {  
      ReportCard r1 = new ReportCard("John");
      
      if (r1.getAverage() < 50)
      {
         System.out.println("Fail");
      }
      else
      {
         System.out.println("Pass");
      }
   }
}