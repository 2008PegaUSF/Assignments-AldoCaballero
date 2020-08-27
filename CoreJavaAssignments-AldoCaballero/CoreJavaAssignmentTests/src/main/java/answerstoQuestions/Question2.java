package answerstoQuestions;

public class Question2 {
	
	public int[] fibnum = new int[25];
	public int x;
	
	public Question2(int x) {
		this.x = x;
	}
	
	public void showFib() { // x is 24 because it starts at 0 so we have to add 1 to accomodate
		for( int i = 0; i < x+1; i++) {
			fibnum[i] = fibFunc(i);
			System.out.print(fibnum[i] + " ");
		}
	}
	
	public int fibFunc(int x) {
		if(x <= 1 ) {
			return x;
		}
		
		return fibFunc(x-1) + fibFunc(x-2);
	}

}
