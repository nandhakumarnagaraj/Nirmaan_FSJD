package Sample;

public class Example {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
			
		System.out.println("This is my first day");
		try {
			c= a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("This is arithimatic expection" +e);
			
		}
		finally {
			System.out.println("This is final block");
		}
		
		
		
		System.out.println("I am from chennai");
	}

}
