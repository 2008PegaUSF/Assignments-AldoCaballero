package answerstoQuestions;

public class Question13 {
	
	static int a;
	static String triangle = "";
	
	public Question13() {
		printTriangle();
	}
	
	public static void printTriangle() {
		for(int counter = 0; counter <= 4; counter++) {	
			for (int i=0; i < counter; i++) {
                if (a == 0) {
                	triangle += a + " ";
                	a = 1;
                }
                else { 
                	triangle += a + " ";
                	a = 0;
                }        
            }
			triangle += "\n";
			
		}
		System.out.println(triangle);
	}
	
	public String getTriangle() {
		return triangle;
	}
}
