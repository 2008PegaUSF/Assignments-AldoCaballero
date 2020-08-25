package answerstoQuestions;

public class Question6 {

	/* Write a method that determines whether an integer is even without
	 * using the modulus operator */
	
	public Question6(int x) {
		int ans = isEven(x);
		if(ans == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
	}
	
	public int isEven(int x) {
		return (x & 1);
	}
}
