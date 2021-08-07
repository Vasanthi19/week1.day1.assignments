package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * What are my learnings from this code? 1)For loop iteration and assigning values inside loop
	 * 
	 */

	public static void main(String[] args) {

		int range = 8, firstNum = 0, secNum = 1, sum = 0;
		
		System.out.println(firstNum +"\n" + secNum);
		
		for (int i = 0; i < range-2; i++) {
			
			sum = firstNum + secNum;
			
			System.out.println(sum);
			
			firstNum = secNum;
			secNum = sum;
			
		}
	}
}
