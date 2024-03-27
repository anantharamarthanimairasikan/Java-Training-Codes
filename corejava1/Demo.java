package corejava1;

public class Demo {

	public static void main(String[] args) {
		String helloworld = "hello world!!";
		 System.out.println(helloworld.length());
		 System.out.println(helloworld.charAt(10));
		
		 System.out.println(helloworld.indexOf('1'));
		 System.out.println("***************************************");
		 for (int index=0;index<helloworld.length();index++) {
			 if(helloworld.charAt(index)=='1'){
				 System.out.println(index);
					
			 }
		 }
		 System.out.println("***************************************");
		 helloworld.concat("\\n world is vry beautifuly");
		 System.out.println(helloworld);
		 String newSt=helloworld.concat("\nworld is vry beautifuly");
		 System.out.println(newSt);
		 System.out.println(helloworld.toUpperCase());
		 System.out.println(helloworld.toLowerCase());
	}

}
