import java.util.Scanner;

class SumOfN1toN2 {
	public static int sum(int n1, int n2) {
		int sum = 0;

		for (int i = n1; i <= n2; i++)
			sum += i;

		return sum;
	}

	public static int getPositiveNumber() {
		Scanner in = new Scanner(System.in);	

		int n = -1;
		while (n < 0) {
			System.out.print("Enter a positive number: ");
			n = in.nextInt();
			if (n < 0)
				System.out.println("You entered a negative value, try again...");
		}

		return n;
	}

	public static void main(String[] args) {
		int n1 = getPositiveNumber();
		int n2 = getPositiveNumber();

		System.out.println("The sum of n12 - n1 is " + sum(n1, n2));
	}	
}