public class Animal
{
   public void makeSound()
   {
      System.out.println("Oink Oink!");
   }
}

class Dog extends Animal
{
   public void makeSound()
   {
    System.out.println("Woof Woof!");
   }
}

class Main
{
public static void main(String[] args)
   {
      Animal a1 = new Animal();
      Dog d1 = new Dog();
      
      a1.makeSound();
      d1.makeSound();
   }
}      