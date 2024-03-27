package corejava1;

public class Employee {
	 private int Empid;
	 private String Empname;
	 private String Empaddr;
	 private double EmpSalary;
	 
	 public Employee() {}
	 
	 public Employee(int Empid, String Empname, double EmpSalary, String Empaddr) {
		 this.Empid= Empid;
		 this.Empname= Empname;
		 this.EmpSalary= Empid;
		 this.Empaddr=Empaddr;
		 
	 }

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public String getEmpaddr() {
		return Empaddr;
	}

	public void setEmpaddr(String empaddr) {
		Empaddr = empaddr;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [Emp Id=" + Empid + "Employee Name" + Empname +"salary=" +EmpSalary + ", address=" + Empaddr + "]";
	}
	 
}
