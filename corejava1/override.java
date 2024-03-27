package corejava1;

class a1{
	void m1() {
		System.out.println("Ejfsbhk");
	}
}
class a2 extends a1{
	void m1() {
		super.m1();
	}
}

public class override {
	
	public static void main(String[]args) {
		a2 a= new a2();
		a.m1();
	}
}
