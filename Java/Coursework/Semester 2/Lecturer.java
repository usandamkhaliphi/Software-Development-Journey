public class Lecturer extends Person
{
   private int employeeNumber;
   private int salary;
   
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }
   
   public void setEmployeeNumber(int n)
   {
      this.employeeNumber = n;
   }
   
   public int getSalary()
   {
      return salary;
   }
   
   public void setSalary(int n)
   {
      this.salary = n;
   }
}