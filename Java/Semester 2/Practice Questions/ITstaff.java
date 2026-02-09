public class ITstaff
{
   public String name;
   public String role;
   public double salary;
   
   public ITstaff(String n, String r, double s)
   {
      this.name = n;
      this.role = r;
      this.salary = s;
   }
}

class Main
{
public static void main(String[] args)
   {
      ITstaff[] staff = new ITstaff[3];
      
      staff[0] = new ITstaff("John","Front End Developer",35724.83);
      staff[1] = new ITstaff("Peter","Back End Developer",61923.32);
      staff[2] = new ITstaff("Samuel","Systems Analyst",13913.42);
      
      for (int counter = 1; counter <= 2; counter++)
      {
         if (staff[counter].salary > 20000)
         {
            System.out.println(staff[counter].name);
         }
      }
   }
}