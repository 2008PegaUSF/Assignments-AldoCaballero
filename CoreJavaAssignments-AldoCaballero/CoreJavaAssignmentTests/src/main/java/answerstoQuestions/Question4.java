package answerstoQuestions;

public class Question4 {

	public int factorial(int n) {
		if(n <= 1) {
			return n;
		}
		return n*factorial(n-1);
	}
}
