/**
 * 10001st prime
 * Problem 7
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see 
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */

class Problem7 {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static int nthPrimeNumber(int n) {
		int x = 2, count = 0; 
		while (true) {
			if (isPrime(x)) {
				count++;
				if (count == n)
					break;
			}

			x++;
		}

		return x;
	}

	public static void main(String[] args) {
		System.out.println(nthPrimeNumber(10001));
	}
}