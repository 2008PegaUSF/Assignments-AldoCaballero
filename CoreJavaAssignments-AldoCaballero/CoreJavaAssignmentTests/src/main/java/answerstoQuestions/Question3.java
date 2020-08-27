package answerstoQuestions;

public class Question3 {
	
	public String reverseString(String s) {
		for (int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length()-i) + s.substring(0, 1) 
			+ s.substring(s.length()-i, s.length());
		}
		
		System.out.println(s);
		return s;
	}
}
