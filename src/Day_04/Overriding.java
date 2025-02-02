package Day_04;

public class Overriding {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Overriding {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}
