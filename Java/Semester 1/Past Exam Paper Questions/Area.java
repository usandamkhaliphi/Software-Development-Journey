import javax.swing.JOptionPane;

public class Area 
{
public static void main(String[] args)
   {
      int num1;
      int num2;
      String outputShape;
      int outputArea;
      
      num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the width"));
      
      if (num1 == num2)
        {
          outputShape = "square";
          outputArea = num1 * num1;
          
          System.out.println("the shape is a " + outputShape + " and the area is " + outputArea);
        }
        
      else
         {
            outputShape = "Rectangle";
            outputArea = num1 * num2;
            
            System.out.println("the shape is a " + outputShape + " and the area is " + outputArea);
         }
    }
}       