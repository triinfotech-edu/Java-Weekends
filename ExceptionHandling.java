import java.util.Scanner;

class ExceptionHandling {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("First number: ");
		int a = in.nextInt();

		System.out.print("Second number: ");
		int b = in.nextInt();
		
		try {
			System.out.println(a + " / " + b + " = " + (a/b));		
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide a number by zero.");
		}

		System.out.println("Continue...");
	}
}