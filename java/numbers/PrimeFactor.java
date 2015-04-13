import java.util.Scanner;

public class PrimeFactor
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Number to factorise?");
    int num = input.nextInt();
    factorise(num);
  }

  public static boolean isPrime(int n)
  {
    for (int i = 2; i <= n/2; i++)
    {
      if (n % i == 0)
      {
        return false;
      }
    }
    return true;
  }

  public static void factorise(int num)
  {
    if (isPrime(num))
    {
      System.out.println("Number is already prime, no prime factors");
    }
    else
    {
      System.out.print("Prime factors are: ");
      for (int i = 2; i <= num/2; i++)
      {
        if (isPrime(i) && num % i == 0)
        {
          System.out.print(i + " ");
        }
      }
      System.out.println("");
    }
  }
}
