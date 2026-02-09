public class JobApplicant
{
   public String name;
   public String position;
   public boolean shortlisted;
   
   public JobApplicant(String n, String p, boolean s)
   {
      this.name = n;
      this.position = p;
      this.shortlisted = s;
   }
}

class Main
{
public static void main(String[] args)
   {
      JobApplicant A1 = new JobApplicant("John","Front end Developer",false);
      JobApplicant A2 = new JobApplicant("Steve","Back end Developer",true);
      JobApplicant A3 = new JobApplicant("Peter","Systems Analyst",false);
      
      if (A1.shortlisted == true)
      {
         System.out.println("Name: " + A1.name + "\n" + "Shortlisted?: " + A1.shortlisted);
      }
      if (A2.shortlisted == true)
      {
         System.out.println("Name: " + A2.name + "\n" + "Shortlisted?: " + A2.shortlisted);
      }
      if (A3.shortlisted == true)
      {
         System.out.println("Name: " + A3.name + "\n" + "Shortlisted?: " + A3.shortlisted);
      }
   }
}