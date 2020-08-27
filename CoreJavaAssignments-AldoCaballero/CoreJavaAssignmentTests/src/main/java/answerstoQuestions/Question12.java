package answerstoQuestions;

public class Question12 {
	
	public static int[] array;
	public static int[] evenArray;
	public static int count;
	
	public Question12() {
		loadArray();
		checkEvenNum(array);
		checkEven();
	}
	
	public static void loadArray() {
		array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
	}
	
	public static void checkEvenNum(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				count++;
			}
		}
		evenArray = new int[count];
	}
	
	public static void checkEven() {
		int j = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				evenArray[j] = array[i];
				j++;
			}
		}
	}
	
	public static void printEven() {
		for(int i: evenArray) {
			System.out.println(i);
		}
		
	}
}
