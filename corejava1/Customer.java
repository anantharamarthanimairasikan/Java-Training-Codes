package corejava1;

public class Customer {
	
	public Customer(int cust_id, String cus_name) {
		super();
		this.cust_id = cust_id;
		Cus_name = cus_name;
	}
	public int cust_id;
	public String Cus_name;
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCus_name() {
		return Cus_name;
	}
	public void setCus_name(String cus_name) {
		Cus_name = cus_name;
	}
	@Override
	public String toString() {
		return "\n Customer Id=" + cust_id + " Customer Name " + Cus_name;
	}
	
	
	
	
}
