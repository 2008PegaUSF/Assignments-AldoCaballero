package answerstoQuestions;

import java.util.ArrayList;

public class Question8  {
	
	/* Write a program that stores the following strings in an ArrayList 
	 * and saves all the palindromes in another ArrayList. 
	 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, 
	 * “kayak”, “john”, “refer”, “billy”, “did”
	 */
	
	ArrayList<String> arrayList = new ArrayList<String>();
	
	public Question8(ArrayList<String> orgList) {
		addPalindrome(orgList);
		printPalindromeList();
	}
	
	
	public static boolean checkPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;	
	}
	
	public void addPalindrome(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			if(checkPalindrome(list.get(i))) {
				arrayList.add(list.get(i));
			}
		}
		
	}
	
	public void printPalindromeList() {
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
