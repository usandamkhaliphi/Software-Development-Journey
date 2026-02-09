c
      int base;
      int input;
      
      input = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the triangle"));
      base = input;
      
      System.out.println("You have entered the Height/Depth/Base of " + base);
      
      for (int row = 0; row < base; row++)
         
         {
            for (int column = 0; column <= row; column++)
            {
               System.out.print(column);
            }
            System.out.println();
         }
    }
}