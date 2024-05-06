
public class StringHelper {
	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringHelper s1 = new StringHelper();
		String res = s1.truncateAInFirst2Positions("ABDB");
		boolean res2 = s1.areFirstAndLastTwoCharactersTheSame("CBDSCB");
		System.out.println("Result is: "+res);
		System.out.println("Are the characters same?... "+res2);

	}

}
