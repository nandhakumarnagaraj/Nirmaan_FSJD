package Day_06;

public class CollegeApplication {
// Superclass: Student
	 public class Student {
		String name;
		String id;
		String course;

		// Constructor
		 public Student(String name, String id, String course) {
			this.name = name;
			this.id = id;
			this.course = course;
		}

		// Method to display basic details
		public void displayDetails() {
			System.out.println("Student Name: " + name);
			System.out.println("Student ID: " + id);
			System.out.println("Course: " + course);
		}
	}

	// Subclass: Hosteler
	public class Hosteler extends Student {
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
	}

	// Subclass: DayScholar
	public class DayScholar extends Student {
		double transportFee;

		// Constructor
		public DayScholar(String name, String id, String course, double transportFee) {
			super(name, id, course); // Using super to pass details to superclass
			this.transportFee = transportFee;
		}

		// Method to calculate and display total fee
		public void calculateFee(double tuitionFee) {
			double totalFee = tuitionFee + transportFee;
			displayDetails();
			System.out.println("Transport Fee: " + transportFee);
			System.out.println("Total Fee: " + totalFee);
		}
	}

}