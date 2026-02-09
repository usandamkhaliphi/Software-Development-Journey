public class Player
{
   public String name;
   public String position;
   public int goalsScored;
   
   public Player(String n, String p, int g)
   {
      this.name = n;
      this.position = p;
      this.goalsScored = g;
   }
}

class Main
{
public static void main(String[] args)
   {
      Player[] p = new Player[5];
      
      p[0] = new Player("John","Striker",3);
      p[1] = new Player("Peter","MidFielder",1);
      p[2] = new Player("John","Centre Back",4);
      
      int Highest = p[0].goalsScored;
      
      for (int counter = 1; counter <= 2; counter++)
      {
         if (p[counter].goalsScored > p[counter - 1].goalsScored)
         {
            Highest = p[counter].goalsScored;
            
            System.out.println("Highest scorer is: " + p[counter].name);
         }
      }
   }
}