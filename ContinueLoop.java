package loops;

public class ContinueLoop {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue; // Skips the iteration when i = 3
			}
			System.out.println(i);
		}

	}
}
