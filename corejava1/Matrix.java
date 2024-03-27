package corejava1;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String[]args) {
		int mat1[][]= new int[3][3];
		int mat2[][]= new int[3][3];
		int resul[][]= new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No for mat1:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat1[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("Enter the No for mat2:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat2[i][j]=scan.nextInt();
			}
		}
		System.out.println("........Addition.........\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				resul[i][j]=mat1[i][j]+mat2[i][j];
				System.out.println(resul[i][j]);
			}
		}
		System.out.println("........Multiplication.........\n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					resul[i][j]=mat1[i][k]*mat2[k][j];
					System.out.println(resul[i][j]);
				}
				
			}
		}
		scan.close();
	}
	

}
