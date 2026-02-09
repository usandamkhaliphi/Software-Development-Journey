public class Patient
{
   public String name;
   public int age;
   public String illness;

public Patient(String n, int a, String i)
{
   this.name = n;
   this.age = a;
   this.illness = i;
}
}

class Main
{
public static void main(String[] args)
   {
      Patient[] patients= new Patient[3];
      
      patients[0] = new Patient("John",45,"Flu");
      patients[1] = new Patient("Peter",24,"Tonsilitis");
      patients[2] = new Patient("Samuel",62,"Cold");
      
      for (int counter = 0; counter <= 2; counter++)
      {
         if (patients[counter].age >= 40)
         {
            System.out.println("Name: " + patients[counter].name + "\n" + "Age: " + patients[counter].age + "\n" + "Illness: " + patients[counter].illness);
         }

      }
   } 
}    