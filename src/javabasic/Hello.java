package javabasic;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello, world!");

		boolean b = "abc" == "abc";
		System.out.println(b);
		
		b = "abc" == new String("abc");
		System.out.println(b);
		
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		
		b = !"abc".equals(new String("abc"));
		System.out.println(b);
	}
}
