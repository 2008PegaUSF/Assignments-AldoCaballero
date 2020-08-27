package answerstoQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Question19 {

	public ArrayList<Integer> list = new ArrayList<Integer>();
	
	public Question19(int decide) {
		loadInteger();
		if (decide == 1) {
			add(0);
		} else if (decide == 2) {
			add(1);
		} else {
			checkPrime(decide);
		}
	}
	
	public Question19(Scanner in) {
		loadInteger();
		
		System.out.println("Select which one you want to choose between");
		System.out.println("(1) Add Only Even Numbers from List");
		System.out.println("(2) Add Only Odd Numbers from List");
		System.out.println("(3) Take Out Prime Numbers from List and Show Updated List");
		int n = in.nextInt();
		
		switch(n) {
			case 1: 
				add(0);
				break;
			case 2:
				add(1);
				break;
			case 3:
				outPrime();
				break;
			default:
				System.out.println("Please use 1, 2, or 3");
		}
	}
	
	public void loadInteger() {
		for(int i = 1; i <= 10; i++) {
			list.add(i);
			System.out.print(list.get(i-1) + " ");
			
		}
		System.out.println();
	}
	
	public int add(int i) {
		int result = 0;
		if (i == 0) {
			for(int j = 0; j < list.size(); j++) {
				if (!(j % 2 == 0)) {
					result += list.get(j);
				}
			}
		} else {
			for (int j = 0; j < list.size(); j++) {
				if (j % 2 == 0) {
					result += list.get(j);
				}
			}
		}
		System.out.println(result);
		return result;
		
	}
	
	public boolean checkPrime(int num) {
        if(num == 1) {
        	return true;
        }
		for(int i = 2; i <= num/2; i++) {
        	if(num % i == 0) {
                return false;
            }
        } return true;
	}
	
	public void outPrime() {
		for(int i = 0; i < list.size(); i++) {
			if(checkPrime(list.get(i))) {
				list.remove(i);
			}
			System.out.print(list.get(i) + " ");
		}
	}
}
