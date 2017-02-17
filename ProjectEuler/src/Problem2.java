import javax.print.DocFlavor.STRING;

public class Problem2 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i = i + 1)
		{
			int first = i;
			for (int j = 100; j < 1000; j = j + 1)
				;
			{
				int second = j;
				int m = first * second;
			}
		}
	}

	
	}
}

		public static boolean isPalidrone(int number){
			{
				string numberstring=""+number;
				STRING reversenumberstring=reversestring(number);
				if(reversenumberstring.equals(numberstring))
				{
					return true;
				}
				
			else{
				return false;