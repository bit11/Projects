import java.util.Scanner;

/**
 * Binary to Decimal and Back Converter - Develop a converter to convert a
 * decimal number to binary or a binary number to its decimal equivalent.
 */

public class ConvertBinary
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("1) Convert from binary to decimal");
    System.out.println("2) Convert from decimal to binary");
    int choice = input.nextInt();

    if (choice == 1) 
    {
      System.out.println("Binary to convert:");
      String binary = input.next();
      calcDec(binary);
    }
    else if (choice == 2)
    {
      System.out.println("Decimal to convert:");
      int decimal = input.nextInt();
      calcBin(decimal);
    }
    else
    {
      System.out.println("Invalid Choice");
    }
  }

  public static void calcBin(int decimal)
  {
    StringBuilder builder = new StringBuilder();
    while (decimal >= 1)
    {
      if (decimal % 2 == 0)
      {
        builder.insert(0, "0");
      }
      else
      {
        builder.insert(0, "1");
      }
      decimal /= 2;
    }
    System.out.println(builder.toString());
  }

  public static void calcDec(String binary)
  {
    int index = 0;
    int decimal = 0;
    for (int i = binary.length() - 1; i >= 0; i--, index++)
    {
      decimal += Math.pow(2, index)
        * Character.getNumericValue(binary.charAt(i)); 
    }
    System.out.println(decimal);
  }
}
