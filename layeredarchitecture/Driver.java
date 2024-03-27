package layeredarchitecture;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		//Created an object of customer class
		Customer cust = new Customer();

		Scanner sc = new Scanner(System.in);
		//Reading input and setting it to customer class object
		cust.setCustId(sc.nextInt());
		cust.setCustName(sc.next());

		//Save the data to base
		//To save customer data need to call service layer
		CustomerService customerService = new CustomerServiceImp();
		String message = customerService.addCustomer(cust);
		System.out.println(message);
		sc.close();
	}

}
