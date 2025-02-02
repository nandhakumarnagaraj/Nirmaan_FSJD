package Day_10;

//Child Class implementing both ParentA and ParentB
public class Child implements ParentA, ParentB {
	int varChild; 

	
	public Child(int varChild) {
		super();
		this.varChild = varChild;
	}

	// Implementing method from ParentA
	@Override
	public void displayA() {
		System.out.println();
	}

	// Implementing method from ParentB
	@Override
	public void displayB() {
		System.out.println();
	}

	// Child class method
	public void displayChild() {
		System.out.println();
	}
}
