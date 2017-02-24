import javax.print.DocFlavor.STRING;

public class Problem2 {
	public static void main(String[] args) {
		int largestPalindrome = 9;
		for (int i = 100; i < 1000; i = i + 1) {
			int first = i;
			for (int j = 100; j < 1000; j = j + 1)

			{
				int second = j;
				int m = first * second;
				String s = Integer.toString(m);
				if (isPalindrome(s)) {
					if (m > largestPalindrome) {
						largestPalindrome = m;
					}
					System.out.println(s);
				}
			}
		}

		System.out.println(largestPalindrome);
	}

	public static Boolean isPalindrome(String a) {
		String reverseA = reverse(a);
		if (reverse(a).equals(a)) {
			Boolean is = true;
			return is;
		} else {
			return false;
		}
	}

	public static String reverse(String number) {

		return new StringBuilder(number).reverse().toString();
	}
}
