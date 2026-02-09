public class MenuItem
{
   public String name;
   public double price;
   
   public MenuItem(String n, double p)
   {
      this.name = n;
      this.price = p;
   }
}

class Main
{
public static void main(String[] args)
   {
      
      MenuItem[] item = new MenuItem[5];
      
      item[0] = new MenuItem("Hamburger and Fries",54.90);
      item[1] = new MenuItem("Sandwich and Fries",35.90);
      item[2] = new MenuItem("Ribs and wings combo",124.90);
      item[3] = new MenuItem("Cheese Burger and Fries",39.90);
      item[4] = new MenuItem("Mixed Grill",149.90);
      
      for (int counter = 0; counter <= 4; counter++)
      {
         if (item[counter].price < 80)
         {
            System.out.println("Item: " + item[counter].name + "\n" + "Price: R" + item[counter].price);
            System.out.println();
         }
     }
   }
}