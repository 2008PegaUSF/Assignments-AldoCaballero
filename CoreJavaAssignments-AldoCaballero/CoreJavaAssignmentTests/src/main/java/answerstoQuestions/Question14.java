package answerstoQuestions;

import java.util.Scanner;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;

public class Question14 {

	/*Write a program that demonstrates the switch case. Implement the following functionalities in
	 * the cases:java
	 * Case 1: Find the square root of a number using the Math class method.
	 * Case 2: Display today’s date.
	 * Case 3: Split the following string and store it in a string array.
	 * “I am learning Core Java”
	 */
	
	public static void SwitchCase(Scanner scan) {
		System.out.println("Please selected between");
		System.out.println("(1) Take a square Root");
		System.out.println("(2) Get Today's Date");
		System.out.println("(3) Split a String into an Array");
		int n = scan.nextInt();
		switch(n) {
		case 1:
			squareRoot(scan);
			break;
		case 2:
			todayDate();
			break;
		case 3: 
			splitString();
			break;
		default: 
			System.out.println("Error, select from 1, 2, or 3");
		}
	}
	
	public static int squareRoot(Scanner scan) {
		
		System.out.println("Enter a number to insert a square root");
		int num = scan.nextInt();
		int num1 = (int) Math.sqrt(num);
		System.out.println("Square root of " + num + " is " + num1);
		return num1;
	}
	
	public static void todayDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
	}
	
	public static void splitString() {
		String s = "I am learning Core Java";
		String[] sArray = s.split(" ");
		for(String word : sArray) {
			System.out.print(word + " ");
		}
	}
}