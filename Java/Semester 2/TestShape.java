 class Shape
{
      public String colour;
      public int size;
      public String shape;
      
      public Shape()
      {
      } 
      
      public Shape(String a, int n, String b)
      {
         this.colour = a;
         this.size = n;
         this.shape = b;
      }
}

public class TestShape
{
   public static void main(String[] args)
   {
     Shape shape0 = new Shape();
      
         shape0.shape = "Square";
         shape0.colour  = "Blue";
         shape0.size = 50;
   }
}