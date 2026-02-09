class Employee
{
   private String name;
   private int employeeId;
   private double salary;
  
  public Employee(String n, int e, double s) 
  {
    this.name = n;
    this.employeeId = e;
    this.salary = s;
  }

     
  public String getName()
   {
      return name;
   }
   
   public int getEmployeeID()
   {
      return employeeId;
   }
   
   public double getSalary()
   {
      return salary;
   }

   public void giveRaise(double percentage)
   {
      salary = salary + (salary * (percentage / 100));
   }
}
public class employees
{
public static void main(String[] args)
   {
      Employee emp = new Employee("John",100,50000);
      
      System.out.println("Before raise: " + emp.getSalary());
      
      emp.giveRaise(5.75);
      
      System.out.println("After raise: " + emp.getSalary());
   }
}