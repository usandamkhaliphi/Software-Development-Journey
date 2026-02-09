class movie // class NOT!!!!! public or private class. Java cannot have more than one PUBLIC class in a single file.
{
   public String title;
   public String genre;
   public double movie_length;
   public int age_restriction;
   
   public movie() // Default Contructor
   {
   } 
   
   public movie(String t, String g, double m, int a) // Overloaded Constructor
   {
      this.title = t;
      this.genre = g;
      this.movie_length = m;
      this.age_restriction = a;
   }
}

public class Watch_movie
{
public static void main(String[] args)
   {
      movie M1 = new movie("The Avengers","Action Adventure",180,16);
      movie M2 = new movie("Infinity War"," ",190,0);
      
      System.out.println("Title: " + M1.title + "Genre: " + M1.genre + "Length: " + M1.movie_length + "Age restriction: " + M1.age_restriction);
      System.out.println("Title: " + M2.title + "Length: " + M2.movie_length);
   }
}