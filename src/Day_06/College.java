package Day_06;

public class College {
	String name;
	String id;
	String course;

	public College(String name, String id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}

	public College() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}

class DayScholar extends College {
	double distance;
	final double ratePerKm = 75.0;

	// Constructor
	public DayScholar(String name, String id, String course, double distance) {
		super(name, id, course);
		this.distance = distance;
	}
	public void calculateFee(double tuitionFee) {
        double transportFee = distance * ratePerKm; // Calculate transport fee based on distance
        double totalFee = tuitionFee + transportFee;
        System.out.println("Distance from College: " + distance + " km");
        System.out.println("Transport Fee: " + transportFee);
        System.out.println("Total Fee: " + totalFee);
    }
	// Subclass: Hosteler
	class Hosteler extends College {
	    double hostelFee;

	    // Constructor
	    public Hosteler(String name, String id, String course, double hostelFee) {
	        super(name, id, course); // Using super to pass details to superclass
	        this.hostelFee = hostelFee;
	    }

	    // Method to calculate and display total fee
	    public void calculateFee(double tuitionFee) {
	        double totalFee = tuitionFee + hostelFee;
	        displayDetails();
	        System.out.println("Hostel Fee: " + hostelFee);
	        System.out.println("Total Fee: " + totalFee);
	    }

		public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
	}

}