public class ArrayExample
{
public static void main(String[] args)
   {
      int [] arr = new int [5];
      int sum = 0;
      
      arr[0] = 24;
      arr[1] = 10;
      arr[2] = 65;
      arr[3] = 12;
      arr[4] = 56;
     
     for (int i = 0; i <= 4; i++)
     {
        sum = sum + arr[i];
     }
     
     System.out.println(sum);
  }
}