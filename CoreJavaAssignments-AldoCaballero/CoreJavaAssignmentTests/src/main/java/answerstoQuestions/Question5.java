package answerstoQuestions;

public class Question5 {
	
	/* Q5. Write a substring method that accepts a string str and an integer idx 
	 * and returns the substring contained between 0 and idx-1 inclusive. 
	 * Do NOT use any of the existing substring 
	 * methods in the String, StringBuilder, or StringBuffer APIs.
	*/
	
	public char[] subString;
	public String sub;
	
	public Question5(String str, int idx) {
		subString = new char[idx];
		sub = subString(str, idx);
		
	}
	
	public String subString(String str, int idx) {
		for (int i = 0; i < idx-1; i++) {
			subString[i] = str.charAt(i);
		}
		String newString = new String(subString);
		return newString;
	}
	
	public String getSub() {
		return sub;
	}
}
