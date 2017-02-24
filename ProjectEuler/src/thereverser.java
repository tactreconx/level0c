import javax.swing.JOptionPane;

public class thereverser {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Type a message!!");
		if (isPalindrome(a)) {

			System.out.println(a + " is a palindrome.");
		} else {
			System.out.println(a + " is not a palindrome.");
		}
	}

	public static Boolean isPalindrome(String a) {
		String reverseA = reverse(a);
		if (reverse(a).equals(a)) {
			Boolean is = true;
			return is;
		} 
		else {
			return false;
		}
	}

	public static String reverse(String number) {

		return new StringBuilder(number).reverse().toString();
	}
}
