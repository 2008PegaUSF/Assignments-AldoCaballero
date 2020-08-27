package answerstoQuestions;

import java.util.Scanner;

public class Question17 {
	
	/* 
	 * Write a program that calculates 
	 * the simple interest on the principal,
	 * rate of interest and
	 * number of years provided by the user. 
	 * Enter principal, rate and time through the console 
	 * using the Scanner class.
	 * Interest = Principal* Rate* Time
	 */
	
	public Question17(Scanner in) {
		System.out.println("What is the principal you want to find the interest in?");
		int princ = in.nextInt();
		System.out.println("What is the interest rate on the principal: " + princ);
		int rate = in.nextInt();
		System.out.println("For how long in terms of years will your principal of " + princ + " with the interest at " + rate + " percent?");
		int time = in.nextInt();		
		getInterest(princ,rate,time);
	}
	
	public static int getInterest(int princ, int rate, int time) {
		int interest = princ * rate * time;
		System.out.println("Your interest for your principal at " + princ + " at the rate of "+ rate + " over the course of " + time + " years, will be ");
		System.out.println(interest + " US Dollars");
		
		return interest;
	}
	
}
