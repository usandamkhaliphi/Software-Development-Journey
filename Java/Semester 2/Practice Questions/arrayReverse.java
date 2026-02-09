public class arrayReverse
{
public static void main(String[] args)
   {
      String [] languages = new String [5];
      
      languages[0] = "Java";
      languages[1] = "Python";
      languages[2] = "HTML";
      languages[3] = "CSS";
      languages[4] = "C#";
      
      for (int counter = 4; counter >= 0; counter--)
      {
         System.out.println(languages[counter]);
      }
   }
}