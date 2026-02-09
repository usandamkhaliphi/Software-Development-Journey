public class Product
{
   public String productName;
   public int productCode;
   public int stockQuantity;
   
   public Product(String n, int c, int q)
   {
      this.productName = n;
      this.productCode = c;
      this.stockQuantity = q;
   }
   
   public void updateStock(int quantity)
   {
      stockQuantity = stockQuantity + quantity;
   }
   
   public int getStockStatus()
   {
      return stockQuantity;
   }
}

class Main
{
public static void main(String[] args)
   {
      Product product = new Product("Bar One",245332,7);
      product.updateStock(5);
      product.getStockStatus();
      
      System.out.println("Product: " + product.productName + "\n" + "Product code: " + product.productCode + "\n" +  "Stock: " + product.stockQuantity);
   }
}
      