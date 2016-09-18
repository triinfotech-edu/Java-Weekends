/**
 * Largest palindrome product
 * Problem 4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the 
 * product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

class Problem4 {
	public static int reverse(int n) {
		return Integer.parseInt(((new StringBuffer(String.valueOf(n))).reverse().toString()));
	}

	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}

	public static void main(String[] args) {
		int firstNum = 0, secondNum = 0;

		for (int n1 = 100; n1 <= 999; n1++) {
			for (int n2 = n1+1; n2 <= 999; n2++) {
				if (isPalindrome(n1*n2)) {
					firstNum = n1;
					secondNum = n2;
				}
			}
		}

		System.out.printf("%d = %d X %d\n", firstNum*secondNum, firstNum, secondNum);
	}
}