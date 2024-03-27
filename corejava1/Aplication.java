package corejava1;

public class Aplication {
	
	public static void main(String[]args) {
		Customer cus= new Customer(1,"Ashwin");
		Customer cus1= new Customer(2,"Rajesh");
		Customer cus2= new Customer(3,"Harish");
		Customer cus3= new Customer(4,"Anand");
		Customer cus4= new Customer(5,"Amirtha");
		Customer cus5= new Customer(6,"Sai");
		Customer cus6= new Customer(7,"Sivu");
		Customer cus7= new Customer(8,"Thiru");
		
		Object []obj = new Object[8];
		obj[0]=cus;
		obj[1]=cus1;
		obj[2]=cus2;
		obj[3]=cus3;
		obj[4]=cus4;
		obj[5]=cus5;
		obj[6]=cus6;
		obj[7]=cus7;
		display(obj);
		
		
	}
	private static void display(Object[] obj) {
		for(Object cust:obj) {
			System.out.println(cust);
		}
	}
}
