package corejava1;
import java.util.Scanner;

public class Paymentapp {
	
		public static void main(String[] args) {
			System.out.println("********Get Payment********");
			System.out.println("********Select Payment Option");
			System.out.println("1. Net Banking");
			System.out.println("2. Credit Card");
			System.out.println("3. Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice==1) {
				PaymentByNetbanking netBanking = new PaymentByNetbanking();
				netBanking.displayInfo();
				System.out.println(netBanking.getPayment());
			}else if(choice ==2) {
				PaymentByCreditcard creditCard = new PaymentByCreditcard();
				creditCard.displayInfo();
				System.out.println(creditCard.getPayment());
			}else {
				System.out.println(" Kasu Illatha unakku Ithuellam Ethuku...!!!");
			}
			sc.close();


		}

	}

