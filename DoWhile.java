package loops;

public class DoWhile { // Post test loop. it is used when we want to execute loop body at least once even condition is false.
	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n); // runs the statement once.
			n++;
		} while (n<0);
	}
}
