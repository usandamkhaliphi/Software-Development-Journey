import javax.swing.JOptionPane;
class vehicle // Superclass (becomes superclass when subclass is declared; otherwise just a regular class
{
   public String make;
   public String model;
   public int year;
}

class car extends vehicle //subclass
{
   public int numDoors;


public car(int n)
{
   this.numDoors = n;
}
}

class motorcycle extends vehicle //subclass
{
   public boolean hasSideCar;


public motorcycle(boolean s)
{
   this.hasSideCar = s;
}
}

public class Vehicles
{
public static void main(String[] args)
   {
      int doors = Integer.parseInt(JOptionPane.showInputDialog("Enter number of doors"));
      
      car myCar = new car(doors);
      
         myCar.make = JOptionPane.showInputDialog("Enter Vehicle make");
         myCar.model = JOptionPane.showInputDialog("Enter Vehicle Model");
         myCar.year = Integer.parseInt(JOptionPane.showInputDialog("Enter Vehicle Year"));

      motorcycle myBike = new motorcycle(true);
         
         myBike.make = JOptionPane.showInputDialog("Enter Motorcycle make");
         myBike.model = JOptionPane.showInputDialog("Enter motorcycle Model");
         myBike.year = Integer.parseInt(JOptionPane.showInputDialog("Enter motorcycle Year"));
         
         System.out.println("Car: " + myCar.make +" " + "model: " + myCar.model + " " + "Year : " + myCar.year);
         System.out.println("Number of doors: " + myCar.numDoors);
         
         System.out.println("Motorcycle: " + myBike.make +" " + "model: " + myBike.model + " " + "Year : " + myBike.year);
         System.out.println("Has sidecar: " + myBike.hasSideCar);
         
       }
    }