package loopsDemo;

public class ASCIITable {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 256) {
			
			System.out.printf("The character at %d is %c\n", i, i);
			
			i++;
			
		}

	}

}
