package answerstoQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import Question11Demo.Question11;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("*************** Question 1 ***************");
		int[] x = {1,0,5,6,3,2,3,7,9,8,4};
		Question1 a = new Question1(x);
		System.out.println();
		
		System.out.println("*************** Question 2 ***************");
		Question2 b = new Question2(24);
		b.showFib();
		System.out.println();
		
		System.out.println("*************** Question 3 ***************");
		Question3 c = new Question3();
		c.reverseString("Hello my name is Aldo");
		
		System.out.println("*************** Question 4 ***************");
		Question4 d = new Question4();
		System.out.println(d.factorial(4));
		
		System.out.println("*************** Question 5 ***************");
		Question5 e = new Question5("Hello", 5);
		System.out.println(e.getSub());
		
		System.out.println("*************** Question 6 ***************");
		Question6 f = new Question6(1);
		
		// Question 7: Employee Sorting
		System.out.println("*************** Question 7 ***************");
		Employee e1 = new Employee("Bad", "Department", 24);
		Employee e2 = new Employee("Bad", "Department", 21);
		Employee[] EmployeeList = new Employee[2];
		EmployeeList[0] = e1;
		EmployeeList[1] = e2;
		
		EmployeeList employeeListComparator = new EmployeeList();
		Arrays.sort(EmployeeList, employeeListComparator);
		System.out.println("Sorted: " + Arrays.toString(EmployeeList));
		
		
		System.out.println("*************** Question 8 ***************");
		ArrayList<String> list8 = new ArrayList<String>();
		list8.add("karan");
		list8.add("madam");
		list8.add("tom");
		list8.add("civic"); 
		list8.add("radar");
		list8.add("jimmy");
		list8.add("kayak");
		list8.add("john");
		list8.add("refer");
		list8.add("billy");
		list8.add("did");
		Question8 h = new Question8(list8);
		
		System.out.println("*************** Question 9 ***************");
		Question9 i = new Question9();
		
		System.out.println("*************** Question 10 ***************");
		Question10 j = new Question10(2,1);
		
		System.out.println("*************** Question 11 ***************");
		Question11 k = new Question11();
		k.getFloats();
		
		System.out.println("*************** Question 12 ***************");
		Question12 l = new Question12();
		l.printEven();
		
		System.out.println("*************** Question 13 ***************");
		Question13 m = new Question13();
		
		//Main Scanner for the Driver
		Scanner scan = new Scanner(System.in);
		System.out.println("*************** Question 14 ***************");
		Question14 n = new Question14();
		n.SwitchCase(scan);
		
		System.out.println("*************** Question 15 ***************");
		Question15 o = new Question15();
		System.out.println("0 + 2 = " + o.addition(0, 2));
		System.out.println("24 - 5 = "+ o.substraction(24,5));
		System.out.println("3 / 1 = " + o.division(3,1));
		System.out.println("5 * 6 = " + o.multiplication(5, 6));
		
		System.out.println("*************** Question 16 ***************");
		Question16 p = new Question16("This is an argument");
		
		System.out.println("*************** Question 17 ***************");
		Question17 q = new Question17(scan);
		
		System.out.println("*************** Question 18 ***************");
		Question18 r = new Question18("aldo", "sdrIP", "10");
		
		System.out.println("*************** Question 19 ***************");
		Question19 s = new Question19(scan);
		
		System.out.println("*************** Question 20 ***************");
		Question20 t = new Question20();
		System.out.println("Refer to Data.txt file made");
		
		scan.close();
		
	}

}
