import java.util.Scanner;

/*
 * B.Howell
 * CSC-151
 * 
 * This will show arithmetic examples
 * 
 */
public class ArithExamples {

	public static void main(String[] args) {
		// declare vars
		double hoursWorked, hourlyRate, grossPay;
		
		// create instance of Scanner - our wonderful input method
		Scanner input = new Scanner(System.in);
	
		// ask user for hours worked
		System.out.print("Enter your hours worked: ");
		hoursWorked = input.nextDouble();
		
		// ask user for hourly pay rate
		System.out.print("Enter your hourly rate: ");
		hourlyRate = input.nextDouble();
		
		// calculate the gross pay
		grossPay = hoursWorked * hourlyRate;
		
		// display gross pay
		System.out.print("Your gross pay is $" + grossPay);
		
		

	}  // End main method

}  // End class
