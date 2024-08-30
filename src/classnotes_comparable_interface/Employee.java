package classnotes_comparable_interface;

public class Employee implements Comparable<Employee> {

	private Integer employeeNumber;
	  private String employeeName;
	  private Double employeeSalary;
	  
		public Employee(Integer employeeNumber, String employeeName, Double employeeSalary) 
		{
			super();
			this.employeeNumber = employeeNumber;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}

		@Override
		public String toString() {
			return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + "]";
		}

		//Sorting based on the Employee ID
	@Override
	public int compareTo(Employee emp) {
		
		return this.employeeNumber-emp.employeeNumber;
	}

}
