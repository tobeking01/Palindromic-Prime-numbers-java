/* @Author Tobechi Onwenu
 * Assignment 3 solution
 * Palindromic prime numbers printer
 * 
 *  What to submit to the drop box?:

[1] Submit   PPrime.java file
[2] Submit the screen shots showing two sample runs.

Test Case 1 (Sample Run 1):

Enter the number of palindromic primes you need:  10
How many numbers you want per row?: 5


Test Case 1 (Sample Run 2):

Enter the number of palindromic primes you need:  100
How many numbers you want per row?: 5

 */

import java.util.Scanner;

public class PPrime {

	/**
	 * Method to find out whether a_number is a prime
	 * 
	 * @param a_number
	 * @return
	 */

	/** Check whether number is prime */
	public static boolean isPrime(int x) {
		int c = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				c = c + 1;
		}
		if (c == 2)
			return true;
		else
			return false;
	}

	/**
	 * Method to find out whether a_number is a a palindrome
	 * 
	 * @param a_number
	 * @return
	 */
	// public static boolean isPalindrome(int a_number)
	public static boolean isPalindrome(int x) {
		// Find the reverse of x
		int rev = 0;
		for (int i = x; i > 0; i /= 10)
			rev = rev * 10 + i % 10;

		// if x and rev are same, then x is palindrome
		return (x == rev);
	}

	/**
	 * Method to print the Prime Palindromes per user input. count of numbers are
	 * printed with row_count numbers showing in each row
	 * 
	 * @param count
	 * @param row_count
	 */
	public static void print(int count, int row_count) {
		System.out.println("The first " + count + " Palindrome numbers are: ");
		System.out.println("**************************************************");

		int number = 0;
		int n = 2;
		while (number < count) {
			if (isPrime(n) && (isPalindrome(n)))

			{
				number++;
				System.out.print(number % row_count == 0 ? n + "\n " : n + " ");
			}
			n++;
		}

	}

	/**
	 * Main method for testing PPrime
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the number of palindromic primes you need: ");
		int count = Input.nextInt();
		System.out.print("How many numbers you want per row?: ");
		int row_count = Input.nextInt();
		print(count, row_count);
	}
}