// this class reverses a string in a couple of different ways
public class ReverseString {

	public static void main(String[] args) {
		String str = "reverse me please";
		System.out.println("original string: " + str);
		String[] parts = str.split(" ");
		reverseString(parts);
		otherReverse(str);
	}

	// just reverses the words
	private static void reverseString(String[] arg) {
		String result = "";
		for (int i = arg.length - 1; i > 0; i--) {
			result += arg[i] + " "; 
		}
		result += arg[0];
		System.out.println("reversed string: " + result);
	}

	// reverse string, character by character
	private static void otherReverse(String str) {
		System.out.println();
		System.out.println("original String: " + str);
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += Character.toString(str.charAt(i));
		}
		System.out.println("other reverse: " + result);
	}
}