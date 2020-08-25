package answerstoQuestions;

public class Question10 {

	public Question10(int x, int y) {
		System.out.println(minTernary(x,y));
	}
	
	public int minTernary(int x, int y) {
		int ans = (x < y)? x: y;
		return ans;
	}
}
