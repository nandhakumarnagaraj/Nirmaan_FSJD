package Day_11;

//Inner class Child1 extends Child
public class Child1 extends Child {

	int d;

	public Child1(int a, int b, int c, int d) {
		super(a, b, c);
		this.d = d;
	}

	public Child1(int a, int b, int c) {
		super(a, b, c);
	}


	@Override
	public void displayParent() {
		System.out.println("Child1 Parent: " + a + " " + b);
	}

	public void displayChild1() {
		System.out.println("Child1: " + a + " " + b + " " + c + " " + d);
	}
}
