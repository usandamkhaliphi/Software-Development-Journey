import javax.swing.JOptionPane;
class laptop
{
   public String brand;
   public int ramSize;
   public int storage;
   
  public laptop()
   {
     this.brand = "Dell";
     this.ramSize = 16;
     this.storage = 512;
   }
   
   public laptop(String brand, int ramSize, int storage) 
   {
        this.brand = brand;
        this.ramSize = ramSize;
        this.storage = storage;
    }
    
   public void upgradeRam(int extraGB)
   {
      ramSize = ramSize + extraGB;
   }

   public String getBrand() 
    {
        return brand;
    }

    public int getRamSize() 
    {
        return ramSize;
    }

    public int getStorage() 
    {
        return storage;
    }
}  

 public class laptop_Specs
 {
 public static void main(String[] args)
 {
   laptop Laptop1 = new laptop();
   laptop Laptop2 = new laptop("HP",16,256);
   
   Laptop1.upgradeRam(8);
   
   System.out.println("Brand: " + Laptop1.getBrand() + "\n" + "RAM: " + Laptop1.getRamSize() + "\n" + "Storage: " + Laptop1.getStorage());
   System.out.println("Brand: " + Laptop2.getBrand() + "\n" + "RAM: " + Laptop2.getRamSize() + "\n" + "Storage: " + Laptop2.getStorage());
 }
 }