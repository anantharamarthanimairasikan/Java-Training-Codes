package corejava1;

public class Mulitipleclass {

	public Mulitipleclass() {
		System.out.println("A1's No arg constructor");
			}
	public Mulitipleclass(int a) {
		System.out.println("A1's arg constructor"+ a);
	}
	public static void main(String[]args) {
		new c1(10);
	}
	  
}
class b1 extends Mulitipleclass {
	b1(){
	System.out.println("b1's No arg constructor");
		}
	b1(int b){
		this("x");
		System.out.println("b1's arg constructor"+ b);
	}
   b1(String b) {
	super(1000);
	System.out.println("b1's arg constructor"+ b);
}
}
class c1 extends b1 {
	c1(){
	System.out.println("c1's No arg constructor");
		}
   c1(int c) {
	super(100);
	System.out.println("c1's arg constructor"+ c);
}
}

