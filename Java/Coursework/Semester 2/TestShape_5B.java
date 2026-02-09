 class Shape
{
      public String colour;
      public String type;
      public String shape;
      
      public Shape()
      {
      } 
      
      public Shape(String a, String n, String b)
      {
         this.colour = a;
         this.type = n;
         this.shape = b;
      }
}

public class TestShape_5B
{
   public static void main(String[] args)
   {
     Shape shape0 = new Shape("blue", "2D", "circle");
   }
}
     