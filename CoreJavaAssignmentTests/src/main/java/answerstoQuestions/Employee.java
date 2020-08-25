package answerstoQuestions;

public class Employee {

		private int age;
		private String department;
		private String name;
		
		public Employee(String name, String department, int age) {
			this.name = name;
			this.department = department;
			this.age = age;	
		}
		
		public String getName() {
			return name;
		}
		
		public String getDepartment() {
			return department;
		}
		
		public int getAge() {
			return age;
		}

		
		public String toString() {
			return " Name: " + name + "\n" + "Department: " 
					+ department + "\n" + "Age: " + age + "\n";
		}
}
