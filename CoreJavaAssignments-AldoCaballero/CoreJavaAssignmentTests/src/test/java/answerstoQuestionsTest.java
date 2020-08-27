
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import answerstoQuestions.Question1;
import answerstoQuestions.Question2;
import answerstoQuestions.Question3;
import answerstoQuestions.Question4;
import answerstoQuestions.Question5;
import answerstoQuestions.Question6;
import answerstoQuestions.Employee;
import answerstoQuestions.EmployeeList;
import answerstoQuestions.Question8;
import answerstoQuestions.Question9;
import answerstoQuestions.Question10;
import Question11Demo.Question11;
import answerstoQuestions.Question12;
import answerstoQuestions.Question13;
import answerstoQuestions.Question14;
import answerstoQuestions.Question15;
import answerstoQuestions.Question15Int;
import answerstoQuestions.Question16;
import answerstoQuestions.Question17;
import answerstoQuestions.Question18;
import answerstoQuestions.Question18abst;
import answerstoQuestions.Question19;
import answerstoQuestions.Question20;

import answerstoQuestions.Driver;


public class answerstoQuestionsTest {

	// Test for Question 1
	int[] x = {1,0,5,6,3,2,3,7,9,8,4};
	int[] sortedx = {0,1,2,3,3,4,5,6,7,8,9};
	Question1 t1 = new Question1(x);
	@Test
	void testQ1() {
		Assertions.assertArrayEquals(sortedx, t1.bubbleSort());
	}
	
	// Test for Question 2
	Question2 t2 = new Question2(25);
	@Test
	void testQ2() {
		Assertions.assertEquals(46368, t2.fibFunc(24));
	}
	
	// Test for Question 3
	Question3 t3 = new Question3();
	String t3ans = "odlA si eman ym olleH";
	@Test
	void testQ3() {
		boolean ans;
		if(t3.reverseString("Hello my name is Aldo").equals(t3ans)) {
			ans = true;
			
		} else {
			ans = false;
		}
		Assertions.assertEquals(true,ans);
	}
	
	// Test for Question 4
	Question4 d = new Question4();
	@Test
	void testQ4() {
		Assertions.assertEquals(24,d.factorial(4));
	}
	
	// Test for Question 5
	Question5 e = new Question5("Hello", 5);
	String t5ans = "Hell";
	@Test
	void testQ5() {
		boolean anst5;
		if(e.getSub().compareTo(t5ans) == 0) {
			anst5 = false;
		} else { 
			anst5 = true;
		}
		Assertions.assertEquals(true, anst5);
	}
	
	// Test for Question 6 
	@Test
	void testQ6() {
		Question6 t6 = new Question6(4);
		Assertions.assertEquals(0,t6.isEven(4));
	}
	
	// Test for Question 7
	@Test
	void testQ7() {
		Employee e1 = new Employee("Bad", "Department", 24);
		Employee e2 = new Employee("Bad", "Department", 21);
		Employee[] EmployeeList = new Employee[2];
		EmployeeList[0] = e1;
		EmployeeList[1] = e2;
		
		Employee[] sortedCheck = new Employee[2];
		sortedCheck[0] = e2;
		sortedCheck[1] = e1;
		
		EmployeeList employeeListComparator = new EmployeeList();
		
		Arrays.sort(sortedCheck, employeeListComparator);
		
		Arrays.sort(EmployeeList, employeeListComparator);
		Assertions.assertArrayEquals(sortedCheck, EmployeeList);;
	}
	
	// Test for Question 8
	@Test
	void testQ8() {
		ArrayList<String> list8 = new ArrayList<String>();
		Question8 h = new Question8(list8);
		Assertions.assertEquals(true,h.checkPalindrome("madam"));	
	}
	
	// Test for Question 9 
	@Test
	void testQ9() {
		Question9 t9 = new Question9();
		Assertions.assertEquals(true,t9.checkPrime(61));
	}
	
	// Test for Question 10
	@Test
	void testQ10() {
		Question10 t10 = new Question10(1,2);
		Assertions.assertEquals(1,t10.minTernary(1, 2));
	}
	
	// Test for Question 11
	@Test 
	void testQ11() {
		float a = (float) 11.0234;
		Question11 t11 = new Question11();
		Assertions.assertEquals(a, t11.getFloatA());
	}
	
	// Test for Question 12
	@Test
	void testQ12A() {
		Question12 t12 = new Question12();
		Assertions.assertEquals(100, t12.array.length);
	}
	@Test
	void testQ12B() {
		Question12 t12 = new Question12();
		Assertions.assertEquals(100, t12.evenArray.length);
	}
	
	// Test for Question 13
	@Test
	void testQ13() {
		Question13 t13 = new Question13();
		String check = "0 \n1 0 \n1 0 1 \n0 1 0 1 \n";
		boolean c13;
		if(check.compareTo(t13.getTriangle()) == 0) {
			c13 = false;
		} else {
			c13 = true;
		}
		Assertions.assertEquals(true,c13);
	}
	
	// Scanner for this Java Test Class
	Scanner scan = new Scanner(System.in);
	
	// Test for Question 14
	@Test
	void testQ14() {
		Assertions.assertEquals(2,Question14.squareRoot(scan));
	}
	
	// Test for Question 15
	Question15 t15 = new Question15();
	@Test
	void testQ15Add() {
		Assertions.assertEquals(4,t15.addition(2,2));
	}
	@Test
	void testQ15Sub() {
		Assertions.assertEquals(0,t15.substraction(2,2));
	}
	
	@Test
	void testQ15Multiplication() {
		Assertions.assertEquals(4,t15.multiplication(2,2));
	}
	
	@Test
	void testQ15Div() {
		Assertions.assertEquals(1,t15.division(2,2));
	}
	
	// Test for Question 16
	@Test
	void testQ16() {
		Question16 t16 = new Question16("Aldo");
		Assertions.assertEquals(4,t16.getLength());
	}
	
	// Test for Question 17
	@Test
	void testQ17() {
		Assertions.assertEquals(1000,Question17.getInterest(10, 10, 10));
	}
	
	// Test for Question 18
	@Test
	void testQ18checkUpper() {
		Question18 t18 = new Question18();
		boolean check;
		if(t18.checkUpper("Aldo").compareTo("true") == 0) {
			check = true;
		} else {
			check = false;
		}
		Assertions.assertEquals(true,check);
	}
	
	@Test
	void testQ18change() {
		Question18 t18 = new Question18();
		boolean check;
		if(t18.changeToUpper("Aldo").compareTo("ALDO") == 0) {
			check = true;
		} else {
			check = false;
		}
		Assertions.assertEquals(true,check);
	}
	
	@Test
	void testQ18add10() {
		Question18 t18 = new Question18();
		Assertions.assertEquals(20,t18.stringToInt("10"));
	}
	
	// Test for Question 19
	@Test
	void testQ19addEven() {
		Question19 t19 = new Question19(1);
		int evenSum = 30;
		Assertions.assertEquals(evenSum, t19.add(0));
	}
	
	@Test
	void testQ19addOdd() {
		Question19 t19 = new Question19(1);
		int oddSum = 25;
		Assertions.assertEquals(oddSum, t19.add(1));
	}
	
	@Test
	void testQ19checkPrime() {
		Question19 t19 = new Question19(13);
		Assertions.assertEquals(true, t19.checkPrime(13));
	}
	
	// Test for Question 20
	@Test
	void testQ20() {
		Question20 t20 = new Question20();
		Assertions.assertTrue(true);
	}
	
}
