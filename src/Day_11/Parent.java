package Day_11;

// Abstract class Parent
 public abstract class Parent {
	int a;
	int b;

	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Parent() {
	}

	// Abstract method to be implemented by subclasses
	public abstract void displayParent();
}
