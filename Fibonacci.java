package fibonacci;

public class Fibonacci {

	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * 
	 * @param n
	 * @return the nth Fibonacci number, computed recursively
	 */
	public static int recursive(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return recursive(n - 1) + recursive(n - 2); // FIXME
		}
	}

	/**
	 * Below write your solution to Fibonacci, using iteration
	 * 
	 * @param n
	 * @return the nth Fibonacci number, computed iteratively
	 */
	public static int iterative(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int first = 1;
			int second = 1;
			for (int i = 1; i < n - 1; i++) {
				int temp = first;
				first += second;
				second = temp;
			}
			return first; 
		}
	}
}
