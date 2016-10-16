import java.util.List;
import java.util.ArrayList;

class Problem12 {
	public static long triangularNumber(long n) {
		if (n == 1)
			return 1;
		else
			return n + triangularNumber(n-1);
	}
	/*
	public static List<Integer> getTriangularSeries(int n) {
		List<Integer> triangularSeries = new ArrayList<>();

		for (int i = 1; i <= n; i++)
			triangularSeries.add(triangularNumber(i));

		return triangularSeries;
	}
    */
	public static int getNoOfDivisors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				count++;

		return count;
	}

	public static void main(String[] args) {
		long n = 10000;

		while (true) {
			if (getNoOfDivisors((int)triangularNumber(n)) >= 400)
				break;

			n++;
		}

		System.out.println(triangularNumber(n));
	}
}