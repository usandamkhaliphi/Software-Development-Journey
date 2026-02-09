public class Employee
{
   public String name;
   public String position;
   
   public Employee(String n, String p)
   {
      this.name = n;
      this.position = p;
   }
   
   public String promote(String newPosition)
   {
      position = newPosition;
      return position;
   }
}

class Main
{
public static void main(String[] args)
   {
      Employee e1 = new Employee("John","Front End Developer");
      System.out.println("New Position: " + e1.promote("Full Stack Developer"));
   }
}