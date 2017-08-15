import java.util.Scanner;

/**
 * 
 *Brendan Howell
 *CSC-151
 *Restaurant Bill Assignment
 */
public class RestaurantBill {

	public static void main(String[] args) {
		// Declare Constants
		final double taxRate = 0.0675;
		final double tipRate = 0.2;
		
		// Declare Variables
		double taxAmount, tipAmount, mealCost, mealAndTax, totalBill;
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Get price of meal
		System.out.println("How much was your meal?");
		mealCost = input.nextDouble();
		
		// Determine tax
		taxAmount = mealCost * taxRate;
		mealAndTax = taxAmount + mealCost;
		
		// Determine tip
		tipAmount = mealAndTax * tipRate;
		totalBill = tipAmount + mealAndTax;
		
		// Print meal cost, tax, tip, and total
		System.out.println("Your meal cost: $" + mealCost);
		System.out.println("The tax was: $" + taxAmount);
		System.out.println("The tip was: $" + tipAmount);
		System.out.println("Your total bill was: $" + totalBill);
		
	}  //End main

}  //End Class
