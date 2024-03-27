package corejava1;
import java.util.Scanner;

public class Newone {

	public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the No:");
		 int N= scan.nextInt();
		 for(int i=0;i<=10;i++) 
		 {
			 int mul=N*i;
			 System.out.println(i+"x"+N+"="+mul);
		 }
		 scan.close();
	}

}
