package Diamond_Problem;

//Interface C
interface ParentC extends ParentA {
	
	default void display() {
		System.out.println("Display method from Interface C");
	}
}
