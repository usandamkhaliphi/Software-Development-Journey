/* original
public class ArrayShift
{
public static void main(String[] args)
   {
      int [] num = new int [5];
         
         num[0] = 67;
         num[1] = 39;
         num[2] = 02;
         num[3] = 84;
         num[4] = 51;
         
         num[1] = num[0];
         num[2] = num[1];
         num[3] = num[2];
         num[4] = num[3];
         num[0] = num[4];

        for (int counter = 0; counter <= 4; counter++)
        {
         System.out.println(num[counter]);
        }
  }
} 

*/

public class LeftShiftArray {
    public static void main(String[] args) {
        int[] num = new int[5];

        // Assigning values
        num[0] = 67;
        num[1] = 39;
        num[2] = 2;
        num[3] = 84;
        num[4] = 51;

        // Store the first element
        int first = num[0];

        // Shift elements to the left
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = num[i + 1];
        }

        // Move the first element to the end
        num[num.length - 1] = first;

        // Display the updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
