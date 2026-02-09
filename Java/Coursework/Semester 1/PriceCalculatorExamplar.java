import javax.swing.JOptionPane;

public class PriceCalculatorExamplar
{

    public static void main(String[] args) 
    {

        int quantity;
        double unitPrice;
        double totalPrice;
        double totalVAT;
        double totalPricewithVAT;
        quantity = 3;
        unitPrice = 4.5;        
        
        totalPrice = unitPrice * quantity;

        JOptionPane.showMessageDialog(null, "The total price is : R " + totalPrice);

        
        totalVAT = totalPrice / 100 * 14;
        
        totalPricewithVAT = totalPrice + totalVAT;
        
        JOptionPane.showMessageDialog(null, "The total price with VAT is : R " + totalPricewithVAT);
        
        System.exit(0);

    }
}
