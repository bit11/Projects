import java.util.Scanner;

/**
 * Mortgage Calculator - Calculate the monthly payments of a fixed term
 * mortgage over given Nth terms at a given interest rate. Also figure out how
 * long it will take the user to pay back the loan. For added complexity, add
 * an option for users to select the compounding interval (Monthly, Weekly,
 * Daily, Continually).
 */

public class Mortgage
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Loan amount?");
    double loan = input.nextDouble();
    System.out.println("Interest rate?");
    double interest = input.nextDouble() / 100;
    double effInterest = interest;
    System.out.println("Term?");
    int term = input.nextInt();
    double effTerm = term;

    System.out.println("Compounding interval?");
    System.out.println("1) Monthly?");
    System.out.println("2) Weekly?");
    System.out.println("3) Daily?");
    int choice = input.nextInt();

    switch (choice)
    {
      case 1:
        effInterest = interest / 12;
        effTerm = term;
        break;
      case 2:
        effInterest = interest / 52;
        effTerm = term * 52 / 12;
        break;
      case 3:
        effInterest = interest / 365;
        effTerm = term * 365 / 12;
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
        double Fv = calcFv(loan, effInterest, effTerm);
        double monthly = Fv / term;
        System.out.println(String.format("Monthly payments are %.2f",
              monthly));
  }

  public static double calcFv(double loan, double interest, double term)
  {
    return loan * Math.pow(1+interest,term);
  }
}
