package Day_13;

public class StaticExample {
    static int regNo = 0; // Shared across all instances

    // Constructor
    public StaticExample() {
        regNo++; // Increment regNo on object creation
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        System.out.println("Registration Number (obj1): " + regNo);

        StaticExample obj2 = new StaticExample();
        System.out.println("Registration Number (obj2): " + regNo);

        StaticExample obj3 = new StaticExample();
        System.out.println("Registration Number (obj3): " + regNo);
    }
}
