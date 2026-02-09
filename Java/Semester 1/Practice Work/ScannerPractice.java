import java.util.Scanner;

public class ScannerPractice
{
public static void main(String[] args)
   {
      String name;
      int age;
      double LuckyNumber;
      boolean student;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your name ");
      name = input.nextLine();
      
      System.out.print("Enter your age ");
      age = input.nextInt();
      
      System.out.print("Enter your lucky number");
      LuckyNumber = input.nextDouble();
      
      System.out.print("Enter true if you are a student and false if you not currently a student");
      student = input.nextBoolean();
      
      System.out.println("Your name is: " + name);
      System.out.println("Your age is: " + age);
      System.out.println("Your lucky number is: " + LuckyNumber);
      System.out.println("You answered: " + student + " to whether you are a student");
  }
}
      
     