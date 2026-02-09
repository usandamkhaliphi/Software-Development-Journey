import javax.swing.JOptionPane;
class vehicle
 {  
    public String Make;  
    public String Model;    
    public int Year;
 }
 
 class car extends vehicle
 {
   public int numDoors;
 
  public car(int n)
      {
         this.numDoors = n;
      }
 }
 
 class motorcycle extends vehicle
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
     int doors = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of doors"));
     car myCar = new car(doors);
        myCar.Make = JOptionPane.showInputDialog("Enter the car make");
        myCar.Model = JOptionPane.showInputDialog("Enter the car model");
        myCar.Year = Integer.parseInt(JOptionPane.showInputDialog("Enter the car year"));
      
     
      motorcycle myBike = new motorcycle(true);
        myBike.Make = JOptionPane.showInputDialog("Enter the motorcycle make"); 
        myBike.Model = JOptionPane.showInputDialog("Enter the motorcycle model");
        myBike.Year = Integer.parseInt(JOptionPane.showInputDialog("Enter the motorcycle year"));
 
        System.out.println("Car: " + myCar.Year + " " + myCar.Make + " " + myCar.Model);
        System.out.println("Number of doors: " + myCar.numDoors);

        
        System.out.println("Motorcycle: " + myBike.Year + " " + myBike.Make + " " + myBike.Model);
        System.out.println("Has sidecar: " + myBike.hasSideCar);
    }
}   