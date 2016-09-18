/**
 * Sum square difference
 * Problem 6
 * 
 * Find the difference between the sum of the squares of the first one hundred 
 * natural numbers and the square of the sum.
 */

class Problem6 {
	private static int sumOfFirstN(int n) {
		if (n == 1)
			return 1;
		else
			return n + sumOfFirstN(n-1);
	}

	public static int sumOfFirstNSquaredN(int n) {
		if (n == 1)
			return 1;
		else
			return n*n + sumOfFirstNSquaredN(n-1);
	}

	public static int squareOfSumOfFirstN(int n) {
		return sumOfFirstN(n) * sumOfFirstN(n);
	}

	public static int difference(int n) {
		return squareOfSumOfFirstN(n) - sumOfFirstNSquaredN(n);
	}

	public static void main(String[] args) {
		System.out.println(difference(100));
	}
}