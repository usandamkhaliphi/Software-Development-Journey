public class Department
{
   public String name;
   public int numStudents;
   
   public Department(String n, int s)
   {
      this.name = n;
      this.numStudents = s;
   }
}

class Main
{
public static void main(String[] args)
   {
      Department d1 = new Department("Science",275);
      Department d2 = new Department("Engineering",350);
      Department d3 = new Department("Mathematics",150);
      
      String max = d1.name;      
      
      if (d2.numStudents > d1.numStudents)
      {
         max = d2.name;
      }
      
      if (d3.numStudents > d2.numStudents)
      {
         max = d2.name;
      }
      
      System.out.println("Department with highest number of students: " + max);
   }
}