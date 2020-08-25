package answerstoQuestions;

import java.util.ArrayList;

public class Question9 {
	/* Create an ArrayList which stores numbers 
	 * from 1 to 100 and prints out all 
	 * the prime numbers to the console.
	 */
	
	ArrayList<Integer> list = new ArrayList<Integer>();

	public Question9() {
		loadNumbers();
		printPrime(list);
	}
	
	public void loadNumbers() {
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
	}
	
	public boolean checkPrime(int n) {
	     boolean flag = true;
	     
	     // When integer is 1, it is not a prime number, so it should not pass
	     if(n == 1) {
	    	 flag = false;
	     }
	     
	     // Makes sure that the integer's half is not divisible
	     for(int i = 2; i <= n/2; ++i) {
	            if(n % i == 0) {
	            	flag = false;
	                break;
	            }
	      }
		return flag;
	}
	
	public void printPrime(ArrayList<Integer> list) {
		for(int i = 0;  i < list.size(); i++) {
			if(checkPrime(list.get(i))) {
				System.out.println(list.get(i));
			}
		}
	}
}
