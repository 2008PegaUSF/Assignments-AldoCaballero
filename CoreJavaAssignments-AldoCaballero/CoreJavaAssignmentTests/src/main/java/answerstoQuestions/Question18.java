package answerstoQuestions;

import java.lang.Character; 

public class Question18 extends Question18abst {
	
	public Question18() {
		
	}
	
	Question18(String checkUpper, String changetoUpper, String toInt) {
		
		System.out.println(checkUpper(checkUpper));
		System.out.println();
		System.out.println(changeToUpper(changetoUpper));
		System.out.println();
		System.out.println(stringToInt(toInt));
		
	}
	
	@Override
	public String checkUpper(String s) {
		boolean b = false;
		char[] c = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(c[i]) == true) {
				return "true";
			}
		}
		return "false";
	}

	@Override
	public String changeToUpper(String s) {
		return s.toUpperCase();
	}

	@Override
	public int stringToInt(String s) {
		int sum = Integer.parseInt(s) + 10;
		return sum;
	}

}
