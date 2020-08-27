package answerstoQuestions;

public class Question1 {
	/* Perform a bubble sort on 
	the following integer array: 
	1,0,5,6,3,2,3,7,9,8,4
	*/
	public int[] x;
	
	public Question1(int[] x) {
		this.x = x;
		bubbleSort();
		for(int k = 0; k < x.length; k++) {
			System.out.print(x[k]);
		}
	}
	
	public int[] bubbleSort() {
		for(int i = 0; i < x.length-1; i++) {
			for( int j = 1; j < x.length-i; j++) {
				if(x[j-1] > x[j]) {
					int temp = x[j-1];
					x[j-1] = x[j];
					x[j] = temp;
				}
			}
		}
		
		return x;
	}
	
	
}
