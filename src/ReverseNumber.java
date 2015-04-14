import java.util.Scanner;

// this class takes in an integer and reverses it.
class ReverseNumber {
	public static void main(String args[]) {
		int number = 0; 
		int reverse = 0;
		System.out.print("Enter the number to reverse ");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();

		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number/10;
		}
		System.out.println("Reverse of entered number is " + reverse);
	}
}