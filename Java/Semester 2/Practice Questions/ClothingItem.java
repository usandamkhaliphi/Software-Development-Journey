class ClothingItem
{
   public String type;
   public String size;
   public double price;
   
   public ClothingItem(String t, String s, double p)
   {
      this.type = t;
      this.size = s;
      this.price = p;
   }
}

class Main
{
public static void main(String[] args)
   {
      ClothingItem i1 = new ClothingItem("T Shirt","S",149.99);
      ClothingItem i2 = new ClothingItem("Shorts","M",99.99);
      ClothingItem i3 = new ClothingItem("Sweater","S",349.99);
      
      
         if (i1.size.equals("M"))
         {
            System.out.println("Clothing Type: " + i1.type + "\n" + "Size: " + i1.size + "\n" + "Price: R" + i1.price);
            System.out.println();
         }
         
         if (i2.size.equals("M"))
         {
            System.out.println("Clothing Type: " + i2.type + "\n" + "Size: " + i2.size + "\n" + "Price: R" + i2.price);
            System.out.println();
         }

         if (i3.size.equals("M"))
         {
            System.out.println("Clothing Type: " + i3.type + "\n" + "Size: " + i3.size + "\n" + "Price: R" + i3.price);
            System.out.println();
         }

      
   }
}