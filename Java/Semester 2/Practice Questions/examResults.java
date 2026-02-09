public class examResults
{
public static void main(String[] args)
   {
      String name;
      int mark;
      
      int[] marks = new int[5];
      
      marks[0] = 74;
      marks[1] = 53;
      marks[2] = 91;
      marks[3] = 39;
      marks[4] = 63;
        
      int Highest = marks[0];
      
      for (int counter = 1; counter <= 4; counter++)
      {
         if (marks[counter] > marks[counter - 1])
         {
            Highest = marks[counter];
            
         }
      }
   
      int lowest = marks[0];
      
      for (int counter = 1; counter <= 4; counter++)
      {
         if (marks[counter] < marks[counter - 1])
         {
            lowest = marks[counter];
            
         }
      }
      
      int average = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
      
      System.out.println("Highest Mark is: " + Highest);
      System.out.println("lowest Mark is: " + lowest);
      System.out.println("Average Mark is: " + average);
   }
}   