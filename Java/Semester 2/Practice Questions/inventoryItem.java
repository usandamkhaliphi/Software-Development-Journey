public class inventoryItem
{
      public String name;
      public int quantity;
      public double pricePerUnit;
      
      public inventoryItem(String n, int q, double p)
      {
         this.name = n;
         this.quantity = q;
         this.pricePerUnit = p;
      }
      
      public double getTotalValue()
      {
         return quantity * pricePerUnit;
      }
      
}


class Main
{
public static void main(String[] args)
   {
      inventoryItem i1 = new inventoryItem("bread",5,18);
      inventoryItem i2 = new inventoryItem("milk",25,34.99);
      inventoryItem i3 = new inventoryItem("eggs",50,59.99);
      i1.getTotalValue();
      
      System.out.println("Item: " + i1.name + "\n" + "Quantity: " + i1.quantity + "\n" + "Price per unit: R" + i1.pricePerUnit + "\n" + "Total Value: R" + i1.getTotalValue());
      System.out.println("Item: " + i2.name + "\n" + "Quantity: " + i2.quantity + "\n" + "Price per unit: R" + i2.pricePerUnit + "\n" + "Total Value: R" + i2.getTotalValue());
      System.out.println("Item: " + i3.name + "\n" + "Quantity: " + i3.quantity + "\n" + "Price per unit: R" + i3.pricePerUnit + "\n" + "Total Value: R" + i3.getTotalValue()); 
  }
}     