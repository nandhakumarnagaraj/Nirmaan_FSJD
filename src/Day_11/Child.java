package Day_11;

//Child class extends Parent
public class Child extends Parent {
	
	int c;

	public Child(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	

	public Child(int a, int b) {
		super(a, b);
	}


	@Override
	public void displayParent() {
		System.out.println("Parent: " + a + " " + b);
	}

	public void displayChild() {
		System.out.println("Child: " + a + " " + b + " " + c);
	}
}
