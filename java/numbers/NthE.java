import java.util.Scanner;

public class NthE
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Calculate exp to how many decimal places?");
    int n = input.nextInt();
    findE(n);
  }

  public static void findE(int n)
  {
    double exp = Math.E;
    System.out.println(String.format("e up to " + n + " digits is %." + n
          + "f.", exp));
  }
}

