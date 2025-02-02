package Sample;

//page2
//child class
public class Child extends Parent {
	int c;

	// Constructor with variable
	public Child(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	// constructor without variable
	public Child(int a, int b) {
		super(a, b);
	}

	// Method to displayChildDetails
	public void displayChilddetails() {
		System.out.println("c=" + c + ", a=" + a + ", b=" + b);
	}

}
