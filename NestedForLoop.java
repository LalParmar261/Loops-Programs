package loops;

public class NestedForLoop { // for loop which contains inside another for loop.
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0  ; j < 5; j++) {
				System.out.print("* ");
			}
 			System.out.println();
		}
	}
}
