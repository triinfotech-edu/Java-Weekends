import java.util.Scanner;
import com.ajaybhatia.utils.StringExt;

class TestSringExt {
	public static void main(String[] args) {
		StringExt ext = new StringExt();
		Scanner in = new Scanner(System.in);

		System.out.print("What's in your mind? ");
		String sentence = in.nextLine();

		System.out.println(ext.toggleCase(sentence));
	}
}