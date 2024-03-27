package corejava1;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the age:");
		 int age= scan.nextInt();
		 int votingage=18;
		 boolean eligiblevote=false;
		 if(age>= votingage) {
			 eligiblevote =true;
			 System.out.print(eligiblevote+"You are Eligible to Vote");
		 }
		 else {
			 System.out.print(eligiblevote+"\tSootha mooditu School ku poda");
		 }
		 scan.close();


}
}
