package Day_09;

import Day_09.Child.Child1;

public class Parent {
	public static void main(String[] args) {
		Child c1= new Child(10, 11, 12);
		Parent p1 =new Parent(1, 2);
		Child1 c11= c1.new Child1(0,0,0,0);
		c1.displayChild();
		p1.displayParent();
		c11.DisplayChild1();
	}
	int a;
	int b;
	
	public Parent(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Parent() {
		super();
	}
	public void displayParent() {
		System.out.println(a + " "+ b );
	}


}
    class Child extends Parent {
	int c;

	public Child(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	public Child(int a, int b) {
		super(a, b);
	}
	
	public void displayChild() {
		System.out.println(a + " "+ b  + " "+ c);
	}
	class Child1 extends Child{
		int d;

		public Child1(int a, int b) {
			super(a, b);
		}

		public Child1(int a, int b, int c, int d) {
			super(a, b, c);
			this.d = d;
		}
		public void DisplayChild1() {
			System.out.println(d);
		}
		
		
	}
}
    
