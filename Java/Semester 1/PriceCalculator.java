import javax.swing.JOptionPane;

public class PriceCalculator {

    public static void main(String[] args) {

        int quantity;
        double unitPrice;
        double totalPrice;
        double totalVAT;
        double totalPricewithVAT;
        
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity"));
        unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of the item"));

        totalPrice = unitPrice * quantity;

        JOptionPane.showMessageDialog(null, "The total price is : R " + totalPrice);

        
        totalVAT = totalPrice / 100 * 14;
        
        totalPricewithVAT = totalPrice + totalVAT;
        
        JOptionPane.showMessageDialog(null, "The total price with VAT is : R " + totalPricewithVAT);
        
        System.exit(0);

    }
}
