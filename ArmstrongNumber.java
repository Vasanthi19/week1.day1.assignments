package week1.day1.assignments;

public class ArmstrongNumber {

	/*
	 * 
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) Usage of while loop and iteration
	 * 
	 * 2) usage of operators
	 * 
	 * 3) Usage of if condition , also got to know {} is not required for single statement.
	 * 
	 */

	public static void main(String[] args) {

		int input = 154;
		int remainder = 0;
		int original = input;
		int calculated = 0;
		int quotient = 1;

		while (quotient != 0) {
			quotient = input / 10;
			remainder = (input % 10);
			calculated = (remainder * remainder * remainder) + calculated;
			input = quotient;
		}
		if (original == calculated)
			System.out.println(calculated + " is an armstrong number");
		else
			System.out.println(original + " is not an armstrong number");
	}
}