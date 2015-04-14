import java.util.Scanner;
/**
 * Find Cost of Tile to Cover W x H Floor - Calculate the total cost of tile it
 * would take to cover a floor plan of width and height, using a cost entered
 * by the user.
 */

public class TileCost
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Length:");
    int length = input.nextInt();
    System.out.println("Breadth:");
    int breadth = input.nextInt();
    System.out.println("Cost per tile (in cents):");
    int cost = input.nextInt();

    int area = findArea(breadth, length);
    int price = findCost(area, cost);
    int dollars = price / 100;
    int cents = price % 100;
    System.out.println(String.format("The total cost is $%d.%d", 
          dollars, cents));
  }

  public static int findArea(int breadth, int length)
  {
    return breadth * length;
  }

  public static int findCost(int area, int cost)
  {
    return area * cost;
  }
}
