public class Workout
{
   public String activity;
   public int duration;
   public double caloriesBurned;
   
   public Workout(String a, int d, double c)
   {
      this.activity = a;
      this.duration = d;
      this.caloriesBurned = c;
   }
   
   public double calculateCaloriesPerMinute()
   {
      double caloriesPerMinute = caloriesBurned / duration;
      return caloriesPerMinute;
   }
}

class Main
{
public static void main(String[] args)
   {
      Workout w1 = new Workout("Running",35,94.2);
      Workout w2 = new Workout("Cycling",50,72.6);
      
      System.out.println("Calories burned per minute for running: " + w1.calculateCaloriesPerMinute());
      System.out.println("Calories burned per minute for cycling: " + w2.calculateCaloriesPerMinute());
   }
}
      