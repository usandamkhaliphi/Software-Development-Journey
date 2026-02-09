public class Applicant
{
   public String name;
   public double score;
   
   public Applicant(String n,double s)
   {
      this.name = n;
      this.score = s;
   }
   
   public boolean isAccepted()
   {
      boolean accepted;
      if (score > 70)
      {
         accepted = true;
      }
      else
      {
         accepted = false;
      }
      return accepted;
   }
}

class Main
{
public static void main(String[] args)
   {
      Applicant a1 = new Applicant("John",72);
      Applicant a2 = new Applicant("Steve",53);
      Applicant a3 = new Applicant("Peter",83);
      Applicant a4 = new Applicant("Samuel",69);
      Applicant a5 = new Applicant("Tom",74);
      
      System.out.println("is accepted?: " + a1.isAccepted());
      System.out.println("is accepted?: " + a2.isAccepted());
      System.out.println("is accepted?: " + a3.isAccepted());
      System.out.println("is accepted?: " + a4.isAccepted());
      System.out.println("is accepted?: " + a5.isAccepted());
   }
}