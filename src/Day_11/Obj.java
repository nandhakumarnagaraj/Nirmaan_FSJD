package Day_11;

public class Obj {
	public static void main(String[] args) {
	    // Create an instance of Child
	    Child c1 = new Child(10, 11, 12);

	    // Create an instance of Child1 using c1
	    Child1 c11 = new Child1(0, 0, 0, 0);

	    // Display details of Parent and Child
	    c1.displayParent();
	    c1.displayChild();

	    // Display details of Child1
	    c11.displayParent();
	    c11.displayChild1();
	}

}
