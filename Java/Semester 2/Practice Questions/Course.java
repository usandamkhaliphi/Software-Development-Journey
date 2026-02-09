/*import java.util.LinkedList;
public class Course
{
     public String courseName;
     public int credits;
      
     public Course(String n, int c)
     {
         this.courseName = n;
         this.credits = c;
     }
}

class Main
{
public static void main(String[] args)
   {
      LinkedList c = new Course();
      
      c.add("LLB",160);
      c.add("MBCHb",240);
      c.add("IT",120);
      c.add("Marketing",180);
      
      System.out.println("Linked list: " + c);
   }
}  
*/ 

import java.util.LinkedList;

public class Course
{
    public String courseName;
    public int credits;

    public Course(String n, int c)
    {
        this.courseName = n;
        this.credits = c;
    }

    @Override
    public String toString()
    {
        return "Course{Name='" + courseName + "', Credits=" + credits + "}";
    }
}

class Main
{
    public static void main(String[] args)
    {
        LinkedList<Course> c = new LinkedList<>();
        c.add(new Course("LLB", 160));
        c.add(new Course("MBCHB", 240));
        c.add(new Course("IT", 120));
        c.add(new Course("Marketing", 180));
        System.out.println("Linked list: " + c);
    }
}
   