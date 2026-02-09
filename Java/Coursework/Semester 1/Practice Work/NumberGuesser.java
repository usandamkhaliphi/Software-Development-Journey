import java.util.Scanner;    

public class NumberGuesser 
{

   
   public static int generateRandomNumber() 
   {
      return (int) (Math.random() * 100) + 1;  
   }

   
      public static void playGame() 
      {
         Scanner scanner = new Scanner(System.in); 
         int secretNumber = generateRandomNumber();  
         int guess = 0;
   
         System.out.println("Guess a number between 1 and 100:");
   
         
         while (guess != secretNumber) 
         {
            guess = scanner.nextInt();  
            if (guess < secretNumber) 
            {
               System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) 
            
            {
               System.out.println("Too high! Try again.");
            } else 
            
            {
               System.out.println("Congratulations! You guessed the number.");
            }
         }
         scanner.close();     }
   
     
      public static void main(String[] args) {
         playGame(); 
      }
}
