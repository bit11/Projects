import java.util.Scanner;

public class ListPrimes
{
  public static void main(String[] args)
  {
    int num = 1;
    String next = "y";
    Scanner input = new Scanner(System.in);
    while (!next.equals("n"))
    {
      num++;
      while(!isPrime(num))
      {
        num++;
      }
      System.out.println(num);
      System.out.println("Find next prime (y/n)?");
      next = input.next();
    }
  }

  public static boolean isPrime(int num)
  {
    for (int i = 2; i <= num/2; i++)
    {
      if (num % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}
