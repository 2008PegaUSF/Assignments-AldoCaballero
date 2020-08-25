package answerstoQuestions;

import java.util.Scanner;
import java.io.*;

public class Question20 {

	private static Scanner x;
	
	public Question20() {
		String filepath = "Data.txt";
		loadFile(filepath);
		editFile(filepath);
	}
	
	public static void loadFile(String filepath) {
		try {
			FileWriter fw = new FileWriter(filepath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("Mickey:Mouse:35:Arizona");
			pw.println("Hulk:Hogan:50:Virginia");
			pw.println("Roger:Rabbit:22:California");
			pw.println("Wonder:Woman:18:Montana");
			
			pw.flush();
			pw.close();

		} catch (IOException e) {
			System.out.println("File already exists!");
			e.printStackTrace();
		}
	}
	
	public static void editFile(String filepath) {
		String tempfile = "temp.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempfile);
		
		String first = "";
		String last = "";
		String age = "";
		String state = "";
		
		try {
			FileWriter fw = new FileWriter(tempfile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			x = new Scanner(new File(filepath));
			x.useDelimiter("[:\n]");
			
			while(x.hasNext()) {
				first = x.next();
				last = x.next();
				age = x.next();
				state = x.next();
				pw.println("Name: " + first + " " + last);
				pw.println("Age: " + age + " years");
				pw.println("State: " + state + " State\n");
			}
			x.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File replace = new File(filepath);
			newFile.renameTo(replace);
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}
