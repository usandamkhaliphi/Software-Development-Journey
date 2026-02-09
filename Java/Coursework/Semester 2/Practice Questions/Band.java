public class Band
{
   public String name;
   public int members;
   
   public Band(String n, int m)
   {
      this.name = n;
      this.members = m;
   }
}

class Main
{
public static void main(String[] args)
   {
      Band b1 = new Band("Band 1",6);
      Band b2 = new Band("Band 2",4);
      Band b3 = new Band("Band 3",5);
      
      System.out.println(b1.name + " has " + b1.members + " members");
      System.out.println(b2.name + " has " + b2.members + " members");
      System.out.println(b3.name + " has " + b3.members + " members");
   }
}