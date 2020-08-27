package answerstoQuestions;

import java.util.Comparator;

public class EmployeeList implements Comparator<Employee> {
	
	
	public int compare(Employee o1, Employee o2) {
				
		if(o1.getName().equals(o2.getName())) {
			return o1.getAge() - o2.getAge();
		} else if(o1.getAge() == o2.getAge()) {
			return o1.getDepartment().compareTo(o2.getDepartment());	
		}
			return o1.getName().compareTo(o2.getName());
	}
}
