import javax.swing.JOptionPane;

public class HallowedOutTriangle {
    public static void main(String[] args) {
        String symbol;
        int printtimes;
        int base;

        symbol = JOptionPane.showInputDialog("Enter your desired symbol");
        System.out.println("You have chosen symbol : " + symbol);
        printtimes = Integer.parseInt(JOptionPane.showInputDialog("Input depth of triangle"));

        for (int row = 1; row <= printtimes; row++) 
        {
            for (int num = 1; num <= row; num++) 
            {
                // Check if it's the first row, the last row, or the current position is at the beginning or end of the row
                if (row == 1 || row == printtimes || num == 1 || num == row) 
                {
                    System.out.print(symbol);
                } 
                else 
                {
                    System.out.print(" "); // Print a space for the hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
