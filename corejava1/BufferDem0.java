package corejava1;

public class BufferDem0 {
	public static void main(String[]args) {
		String s= new String("abc Technologies");
		StringBuffer St = new StringBuffer(s);
		String sub1= St.substring(6, 12);
		String sub2 = St.substring(6);
		CharSequence sub3=St.subSequence(1, 5);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}

}
