package loops;

public class ForLoop { // perform when initialization, condition and increment/dec operation in single line.
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");	// Output: 1 2 3 4 5 6 7 8 9 10 
		}System.out.println();
		
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");	// Output: 10 9 8 7 6 5 4 3 2 1 
		}
	}
}
