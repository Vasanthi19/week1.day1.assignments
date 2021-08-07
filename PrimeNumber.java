package week1.day1.assignments;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * What are my learnings from this code? 
	 * 1)learned using for loop and boolean condition
	 * 2)On testing with different values understood the importance of setting the condition in for loop
	 * 
	 */

	public static void main(String[] args) {

		int input = 13;
		int rem = 1;
		boolean flag = false;

		for (int i = 2; i <= input/2; i++) { 
			//i<=input/2 condition is given because if the input=4, i<input/2 condition not working, will get a wrong output
			rem = input % i;
			System.out.println("rem :" + input % i);
			if (rem == 0) {
				System.out.println(input + " is not a Prime number");
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(input + " is a Prime number");
	}
}