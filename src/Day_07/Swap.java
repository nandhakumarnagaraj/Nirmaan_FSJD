package Day_07;

public class Swap {
	public static void main(String[] args) {
		int a=10;
		int b=23;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
