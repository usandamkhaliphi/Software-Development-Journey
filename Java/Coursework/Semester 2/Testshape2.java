class shape2
{
public String colour;
public String type;
public int size;

public shape2()
{
}
   public shape2(String c, String a, int s)
   {
       this.colour = c;
       this.type = a;
       this.size = s;
   }

}      
      public class Testshape2
      {
      public static void main(String[] args)
      {
         shape2 shape2 = new shape2();
         
         shape2.type = "2D";
         shape2.colour = "blue";
         shape2.size = 10;
      }  
      }