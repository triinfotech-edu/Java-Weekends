import java.util.Scanner;

class Constraints {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter something: ");
		String str = in.nextLine();

		UpperCase c = new UpperCase();

		System.out.println(c.upperCaseCharEachWord(str));
	}
}