package Diamond_Problem;

//Interface B
interface ParentB extends ParentA {
	
	default void display() {
		System.out.println("Display method from Interface B");
	}
}
