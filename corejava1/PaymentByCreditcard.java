package corejava1;

public class PaymentByCreditcard extends Payment{

		@Override
		public int getPayment() {
			System.out.println("Payment is done through credit card");
			return (1000*2);
		}
		public void displayInfo() {
			System.out.println("I am displayInfo method inside abstract class Payment");
		}

	}

