import java.io.IOException;
import java.io.InputStream;

class Exec {
	public static void main(String[] args) {
		try {
			//for (int i = 0; i < args.length; i++) {
				Process process = Runtime.getRuntime().exec("ls -l");
				InputStream in = process.getInputStream();
				int j;

				while ((j = in.read()) != -1) {
					System.out.print((char)j);
				}
			//}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}