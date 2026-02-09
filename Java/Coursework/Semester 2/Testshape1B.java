 class Shape1
{
   public String colour;
   public String shape;
   public int size;
   
   public Shape1()
   {
   } // Default Constructor
   
   
   public Shape1(String a, String b, int n)
   {
      this.colour = a;
      this.shape = b;
      this.size = n; // overloaded constructor
   }
}


public class Testshape1B
{
   public static void main(String[] args)
   {
      Shape1 shape1 = new Shape1();
      
      Shape1 shape2 = new Shape1("Blue", "Square", 50);// overloaded constructor
           
   }
}