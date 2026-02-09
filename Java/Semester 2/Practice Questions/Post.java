public class Post
{
   public String content;
   public int likes;
   
   public Post(String c, int l)
   {
      this.content = c;
      this.likes = l;
   }
   
   public int likePost()
   {
      likes = likes + 1;
      return likes;
   }
}

class Main
{
public static void main(String[] args)
   {
      Post p1 = new Post("Picture of Cat",5);
      
      p1.likePost();
      p1.likePost();
      p1.likePost();
      
      System.out.println(p1.likes);
   }
}