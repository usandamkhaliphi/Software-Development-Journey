import java.util.LinkedList;
public class Recipe
{
   public String name;
   
   LinkedList l1 = new LinkedList();
   
   public Recipe(String n)
   {
      this.name = n;
   }
   
   public void addIngredients(String ingredient)
   {
      l1.add(ingredient);
   }
   
   public String displayIngredients() 
   {
    String ingredients = "Linked List: " + l1.toString();  
    return ingredients;
   }
}

class Main
{
public static void main(String[] args)
   {
      Recipe r1 = new Recipe("Cake");
      
      r1.addIngredients("Flour");
      r1.addIngredients("Eggs");
      r1.addIngredients("Milk");
      r1.addIngredients("Sugar");
      r1.addIngredients("Icing Sugar");
      
      System.out.println(r1.displayIngredients());
   }
}