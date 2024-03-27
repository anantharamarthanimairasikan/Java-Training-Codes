package corejava1;

public class BufferClass {

	public static void main(String[]args) {
		StringBuffer s = new StringBuffer();
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.append(" Mic testing"));
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" Mic testing"));
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(22, "Ashwin");
		System.out.println(sb);
		sb.deleteCharAt(24);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(s);

	}

}
