package Diamond_Problem;

//Class D implementing both B and C
public class ChildD implements ParentB, ParentC {
//public class childD extends parentA,ParentC
	// Resolving the diamond problem
	@Override
	public void display() {
		// Choosing explicitly which display method to call
		ParentB.super.display(); // Call display from B
		ParentC.super.display(); // Call display from C
		System.out.println("Display method from Class D");
	}

	// Main Method
	public static void main(String[] args) {
		ChildD obj = new ChildD();
		obj.display();
	}
}
