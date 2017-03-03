public class EvenSumOrig {
	public static void main(String[] args) {

		for (int i = 0; i < 1001; i = i + 1) {
			;
			int even = i / 2;
			int sum = even + even;

			System.out.println(sum);
		}

	}

}
