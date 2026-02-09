 class Shape1
{
   public String colour;
   public String shape;
   public int size;
   
   public Shape1()
   {
   }
   
   
   public Shape1(String a, String b, int n)
   {
      this.colour = a;
      this.shape = b;
      this.size = n;
   }
}


public class Testshape1
{
   public static void main(String[] args)
   {
      Shape1 shape1 = new Shape1();
      
      shape1.shape = "Square";
      shape1.colour = "Blue";
      shape1.size = 50;
           
   }
}