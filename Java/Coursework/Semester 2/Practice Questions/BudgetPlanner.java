public class BudgetPlanner
{
public static void main(String[] args)
   {
      double total;
      double average;
      
      double [] expense = new double[5];
      
      expense[0] = 478.49;
      expense[1] = 3823.37;
      expense[2] = 17349.47;
      expense[3] = 2364.74;
      expense[4] = 4924.93;
      
      total = expense[0] + expense[1] + expense[2] + expense[3] + expense[4];
      average = total / 5;
      
      System.out.println("Total Expenses: R" + total);
      System.out.println("Average Expense: R" + average);
   }
}