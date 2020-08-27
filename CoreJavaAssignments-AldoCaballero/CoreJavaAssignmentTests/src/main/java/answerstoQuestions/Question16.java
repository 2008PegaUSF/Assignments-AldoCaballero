package answerstoQuestions;

public class Question16 {
	
	public static int length; 
	
	public Question16(String input) {
		String[] args = new String[input.length()];
		for(int i = 0; i < input.length(); i++) {
			args[i] = input.substring(i,i+1);
		}
		main(args);
	}
	
	public static void main(String[] args) {
		length = args.length;
		System.out.println(length);
		
	}
	
	public int getLength() {
		return length;
	}

}
