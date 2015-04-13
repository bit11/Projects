import java.util.Scanner;

public class Fibonacci
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Display how many numbers in the Fibonacci Series?");
    int n = input.nextInt();
    findFibo(n);
  }

  public static void findFibo(int n)
  {
    int oldFibo = 0;
    int newFibo = 1;
    int counter = 0;

    while (counter < n)
    {
      System.out.print(oldFibo + " ");
      int tmp = oldFibo;
      oldFibo = newFibo;
      newFibo += tmp;
      counter++;
    }
    System.out.println("");
  }
}
