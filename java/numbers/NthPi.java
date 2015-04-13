import java.util.Scanner;

public class NthPi
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many decimal places to display pi to?");
    int n = input.nextInt();
    findPi(n);
  }

  public static void findPi(int n)
  {
    double pi = 4.0 * (4.0*Math.atan(0.2) - Math.atan(1.0/239.0));
    System.out.println(String.format("Pi up to " + n + " digits is %." + n
          + "f.", pi));
  }
}
