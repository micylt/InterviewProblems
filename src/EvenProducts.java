
public class EvenProducts {

	public static void main(String[] args) {
		int result = multiplyEvens(4);
		System.out.println("product of first n evens in 4: " + result);
	}

	// returns the product of the first n even integers
	public static int multiplyEvens(int n) {

		if (n <= 0) {
			throw new IllegalArgumentException("Values less than or equal to 0 not allowed");
		}

		if (n == 1) {
			return 2; 

		} else {
			return (2 * n) * multiplyEvens(n - 1);
		}
	}
}