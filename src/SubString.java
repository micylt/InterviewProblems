
public class SubString {
	// just showing that the last index that is not ther is empty
	public static void main(String[] args) {
		String str = "abbdt";
		String sub = str.substring(1);
		System.out.println(str);
		System.out.println(sub);
		if(hasX(str)) {
			System.out.println("\"" + str + "\"" + " contains the character 'x'");
		} else {
			System.out.println("\"" + str + "\"" + " doesn't contain the character 'x'");
		}
	}

	// checking if the given string contains the character 'x'
	public static boolean hasX(String s) {
		/* Now that you know the base case(s), figure out 
		 * what the answer for the base case is. */
		if (s.equals("")) {
			return false;
		}
		/* Now, we have to figure out the recursive step. 
		 * First, write down what the function we are writing does. */
		//	 This function...tests if a string has an 'x' in it
		else {
			/* Then, ask the question: 
			 * "What is the smallest piece of the problem I can break off?" */
			// The smallest piece I can break off is...
			// one character: the first character
			char first = s.charAt(0);

			/* Figure out the answer to the question for the tiny problem.
			 * and do the rest recursively. */
			return first == 'x' || hasX(s.substring(1));
		}
	}
}
