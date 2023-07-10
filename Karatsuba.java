// Java implementation of Karatsuba algorithm for bit string multiplication.

public class Karatsuba {
	public static void main(String[] args)
	{
		System.out.println(multiply("1100", "1010"));
		System.out.println(multiply("110", "1010"));
		System.out.println(multiply("11", "1010"));
		System.out.println(multiply("1", "1010"));
		System.out.println(multiply("0", "1010"));
		System.out.println(multiply("111", "111"));
		System.out.println(multiply("11", "11"));
	}

	
	private static int makeEqualLength(StringBuilder str1,
									StringBuilder str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 < len2) {
			for (int i = 0; i < len2 - len1; i++) {
				str1.insert(0, '0');
			}
			return len2;
		}
		else if (len1 > len2) {
			for (int i = 0; i < len1 - len2; i++) {
				str2.insert(0, '0');
			}
		}
		return len1; 
	}

	
	private static StringBuilder
	addBitStrings(StringBuilder first, StringBuilder second)
	{
		StringBuilder result = new StringBuilder();
		int length = makeEqualLength(first, second);
		int carry = 0;

		
		for (int i = length - 1; i >= 0; i--) {
			int firstBit = first.charAt(i) - '0';
			int secondBit = second.charAt(i) - '0';

			
			int sum = (firstBit ^ secondBit ^ carry) + '0';
			result.insert(0, (char)sum);

			
			carry = (firstBit & secondBit)
					| (secondBit & carry)
					| (firstBit & carry);
		}

		
		if (carry == 1) {
			result.insert(0, '1');
		}

		return result;
	}

	
	private static int multiplySingleBit(int a, int b)
	{
		return a * b;
	}

	
	public static long multiply(String X, String Y)
	{
	
		int n = Math.max(X.length(), Y.length());
		X = String.format("%" + n + "s", X)
				.replace(' ', '0');
		Y = String.format("%" + n + "s", Y)
				.replace(' ', '0');

		if (n == 0)
			return 0;
		if (n == 1)
			return Integer.parseInt(X)
				* Integer.parseInt(Y);

		int fh = n / 2;
		int sh = n - fh;
		
		String Xl = X.substring(0, fh);
		String Xr = X.substring(fh);

		
		String Yl = Y.substring(0, fh);
		String Yr = Y.substring(fh);

		
		long P1 = multiply(Xl, Yl);
		long P2 = multiply(Xr, Yr);
		long P3 = multiply(Integer.toBinaryString(
							Integer.parseInt(Xl, 2)
							+ Integer.parseInt(Xr, 2)),
						Integer.toBinaryString(
							Integer.parseInt(Yl, 2)
							+ Integer.parseInt(Yr, 2)));

		
		return P1 * (1L << (2 * sh))
			+ (P3 - P1 - P2) * (1L << sh) + P2;
	}
}
