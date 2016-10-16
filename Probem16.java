import java.math.BigInteger;

class Probem16 {
	public static void main(String[] args) {
		BigInteger b = BigInteger.valueOf(Integer.parseInt(args[0]))
			.pow(Integer.parseInt(args[1]));

		int sum = 0;
		while (b.compareTo(BigInteger.valueOf(0)) == 1) {
			sum += b.remainder(BigInteger.valueOf(10)).intValue();
			b = b.divide(BigInteger.valueOf(10));
		}

		System.out.println(sum);
	}
}