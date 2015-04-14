import java.util.Scanner;

/**
 * Change Return Program - The user enters a cost and then the amount of money
 * given. The program will figure out the change and the number of quarters,
 * dimes, nickels, pennies needed for the change.
 */

public class ReturnChange
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Cost of stuff? (in cents)");
    int cost = input.nextInt();
    System.out.println("Money given? (in cents)");
    int paid = input.nextInt();

    int change = paid - cost;
    printChange(change);
  }

  public static void printChange(int change)
  {
    int[] coins = {100, 50, 20, 10, 5, 2, 1};
    int left = change;
    int sum = 0;

    for (int coin : coins)
    {
      while (left > 0)
      {
        left -= coin;
        if (left < 0)
        {
          left += coin;
          break;
        }
        else
        {
          System.out.print(coin + " ");
          sum += coin;
        }
      }
    }
    System.out.println(", Total change = " + sum);
  }
}
