public class Student extends Person
{
   private int studentNumber;
   private int yearOfStudy;
   
      public int getStudentNumber()
      {
         return studentNumber;
      }
      
      public void setStudentNumber(int n)
      {
         this.studentNumber = n;
      }
      
   public int getYearOfStudy()
      {
         return yearOfStudy;
      }

      public void setYearOfStudy(int n)
      {
         this.yearOfStudy = n;
      }
}