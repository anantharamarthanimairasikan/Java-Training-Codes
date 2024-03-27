package corejava1;

public class PaymentByNetbanking extends Payment{
	
	
	@Override
	public int getPayment() {
		System.out.println("Payment is done through net banking");
		return 1000;
	}

	public void displayInfo() {
		System.out.println("I am displayInfo method inside abstract class Payment");
		
	}

}
