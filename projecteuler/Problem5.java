/**
 * Smallest multiple
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without 
 * any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers 
 * from 1 to 20?
 */

class Problem5 {
	static final int LARGEST = 20;

	public static boolean isSmallestNumber(int num) {
		for (int n = 1; n <= LARGEST; n++)
			if (num % n != 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		int n = LARGEST;

		while (true) {
			if (isSmallestNumber(n))
				break;

			n += LARGEST;
		}

		System.out.println(n);
	}
}