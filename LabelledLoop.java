package loops;

public class LabelledLoop {
	public static void main(String[] args) {
		outerLoop: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					continue outerLoop; // Skips the outer loop's current iteration
				}
				System.out.println("i: " + i + ", j: " + j);
			}
		}

	}
}
