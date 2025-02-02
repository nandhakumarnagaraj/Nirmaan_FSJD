package Sample;

//page 1
//Parent Class
public class Parent {
	int a;
	int b;

	// Constructor with values
	public Parent(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	// Construtor without Values
	public Parent() {
		super();
	}
	
	//Methods to display parent details
	public void displayParentDetails() {
		System.out.println( a + " " + b);
		
	}

}
