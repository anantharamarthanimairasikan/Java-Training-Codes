package corejava1;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);
		employee.setEmpid(1);
		employee.setEmpname("Ashwin");
		employee.setEmpSalary(60000.00);
		employee.setEmpaddr("Thuthukudi");
		System.out.println(employee);
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpname());
		System.out.println(employee.getEmpSalary());
		System.out.println(employee.getEmpaddr());
		Employee employee1= new Employee(2,"Harish",30000.00,"Chennai");
		System.out.println(employee1);
	}

}
