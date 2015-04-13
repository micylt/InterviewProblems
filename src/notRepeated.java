import java.util.Arrays;

public class notRepeated {
	public static void main(String[] args) {
		int[] arg = new int[10];
		makeArray(arg);
		System.out.println("The non-repeated number was: " + noRepeats(arg));
		System.out.println("The entire array: " + Arrays.toString(arg));
	}

	public static void makeArray(int[] val) {
		for (int i = 0; i < val.length; i++) {
			val[i] = 1;
		}
		val[5] = 3;
	}
	
	public static int noRepeats(int[] val) {
		int repeat = 0;
		if (val[0] == val[1]) {
			repeat = val[0];
		} else if (val[0] == val[2] && val[0] != val[1]) {
			return val[1];
		}
		for (int i = 1; i < val.length; i++) {
			if (val[i] != repeat) {
				return val[i];
			}
		}
		return -1;
	}
}