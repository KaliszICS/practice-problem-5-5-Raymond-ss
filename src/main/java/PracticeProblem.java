public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome(String word) {

		String clean = word.replace(" ", "").toLowerCase();

		int len = clean.length();

		for (int i =0; i < len/2; i++){
			char forwards = clean.charAt(i);
			char backwards = clean.charAt(len -1 - i);

			if (forwards != backwards) {
				return false;
			}
		}
		return true;
	}

}
