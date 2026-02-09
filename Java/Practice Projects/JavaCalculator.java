import java.util.Scanner;

public class JavaCalculator
{
public static void main(String[] args)
   {
      while (true)
    {
      System.out.println("Welcome to the Calculator");
      System.out.println();
      System.out.println("For Addition(+), Enter 1.");
      System.out.println("For Subtraction(-), Enter 2.");
      System.out.println("For Multiplication(X), Enter 3.");
      System.out.println("For division(÷), Enter 4.");
      System.out.println("To Exit, Enter 5.");
      
      Scanner scanner = new Scanner(System.in);
      
      int input = scanner.nextInt();
      
         if (input == 5) 
  {
    System.out.println("Exiting Calculator. Goodbye!");
      break; 
  }
         
         System.out.print("Enter first number: ");
         double num1 = scanner.nextDouble();
         
         System.out.print("Enter second number: ");
         double num2 = scanner.nextDouble();

      if (input == 1)
      {
         System.out.println("You have chosen Addition.");
                  
         double answer = num1 + num2;
         
         System.out.println("Answer: " + answer);
     }
     
     if (input == 2)
      {
         System.out.println("You have chosen Subtraction.");
                  
         double answer = num1 - num2;
         
         System.out.println("Answer: " + answer);
     }
     
     if (input == 3)
      {
         System.out.println("You have chosen Multiplication.");
         
         
         double answer = num1 * num2;
         
         System.out.println("Answer: " + answer);
     }
     
     if (input == 4)
      {
         System.out.println("You have chosen division.");
         
         
         if (num2 == 0) 
         {
                System.out.println("Error: Division by zero is not allowed!");
         } else 
            
            {
                double answer = num1 / num2;
                System.out.println("Answer: " + answer);
            }     
      }
  
  System.out.println();
  }
}
}