public class IntegerDemo
{
public static void main(String[] args)
   {
      int anInt;
      byte aByte;
      short aShort;
      long aLong;
      int anotherInt;
      
      anInt = 1234;
      aByte = 12;
      aShort = 12345;
      aLong = 1234567890987654321L;
      anotherInt = anInt * 10000000;
      
      System.out.println("The int is " + anInt);
      System.out.println("The byte is " + aByte);
      System.out.println("The short is " + aShort);
      System.out.println("The long is " + aLong);
      System.out.println("Another int is " + anotherInt);
    }
}