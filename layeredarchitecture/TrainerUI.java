package layeredarchitecture;

import java.util.Scanner;

public class TrainerUI {
	public static void main(String[] args) {
		//Created an object of customer class
		Trainer trainer = new Trainer();
		
		Scanner sc = new Scanner(System.in);
		//Reading input and setting it to login class object
		System.out.println("1.Login");
		System.out.println("2.Signup");
		int choice= sc.nextInt();
		if(choice==1) {
			trainer.setTrainername(sc.next());
			trainer.setPassword(sc.next());
			//Verify whether username and password matches with data from the database
			TrainerService loginService = new TrainerServices();
			String message = loginService.verifyTrainerameAndPassword(trainer);
			System.out.println(message);
			sc.close();
		}
		else if(choice==2) {
			trainer.setTrainerid(sc.nextInt());
			trainer.setTrainername(sc.next());
			trainer.setPassword(sc.next());
			
			TrainerService createservice = new TrainerServices();
			String message1= createservice.addTrainer(trainer);
			System.out.println(message1);
			System.out.println("For login enter 2:");
			choice=sc.nextInt();
			
			
		}
		else {
			System.out.println("Invalid Option");
			System.out.println("Re Enter the choice");
			choice=sc.nextInt();
		}

		
		

}
}
