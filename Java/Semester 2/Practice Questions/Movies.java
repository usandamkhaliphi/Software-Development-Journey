class Movie
{

   private String title;
   private double rating;
   
   public Movie(String t, double r)
   {         
     this.title = t;
     this.rating = r;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String n)
   {
      this.title = n;
   }
   
   public double getRating()
   {
      return rating;
   }
   
   public void setRating(double r)
   {
      this.rating = r;
   }
   
}

public class Movies
{
public static void main(String[] args)
   {
      Movie [] movie = new Movie [3];
      
      movie[0] = new Movie("Avengers", 7.5);
      movie[1] = new Movie("The Incredibles", 8.3);
      movie[2] = new Movie("Toy Story", 9.6);
      
      for (int counter = 0; counter <= 2; counter++)
      {
        if (movie[counter].getRating() >= 7.5)
            {
                System.out.println(movie[counter].getTitle() + ": " + movie[counter].getRating());
            }
      }
    }
}     