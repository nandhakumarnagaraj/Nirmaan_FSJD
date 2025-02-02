package Day_06;

import java.util.Scanner;

public class CollegeFinal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Select course
		System.out.println("Select Course:");
		System.out.println("1. Computer Science (Tuition Fee: 50000)");
		System.out.println("2. Information Technology (Tuition Fee: 40000)");
		int courseOption = scanner.nextInt();

		String course;
		double tuitionFee;
		if (courseOption == 1) {
			course = "Computer Science";
			tuitionFee = 50000;
		} else if (courseOption == 2) {
			course = "Information Technology";
			tuitionFee = 40000;
		} else {
			System.out.println("Invalid course selection!");
			return;
		}

		// Select student type
		System.out.println("Select Student Type:");
		System.out.println("1. Day Scholar");
		System.out.println("2. Hosteler");
		int studentType = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		// Get common student details
		System.out.println("Enter Student Name:");
		String name = scanner.nextLine();

		System.out.println("Enter Student ID:");
		String id = scanner.nextLine();

		if (studentType == 1) { // Day Scholar
			System.out.println("Enter Distance from College (in km):");
			double distance = scanner.nextDouble();

			// Create DayScholar object
			DayScholar dayScholar = new DayScholar(name, id, course, distance);

			System.out.println("\n=== Day Scholar Details ===");
			dayScholar.calculateFee(tuitionFee);

		} else if (studentType == 2) { // Hosteler
			System.out.println("Enter Hostel Fee:");
			double hostelFee = scanner.nextDouble();

			// Create Hosteler object
			Hosteler hosteler = new Hosteler(name, id, course, hostelFee);

			System.out.println("\n=== Hosteler Details ===");
			hosteler.calculateFee(tuitionFee);

		} else {
			System.out.println("Invalid student type selection!");
		}

		scanner.close();
	}
}

// Superclass: Student
class Student {
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

// Subclass: DayScholar
class DayScholar1 extends Student {
	double distance;
	final double ratePerKm = 10.0; // Rate per kilometer

	// Constructor
	public DayScholar1(String name, String id, String course, double distance) {
		super(name, id, course); // Using super to pass details to superclass
		this.distance = distance;
	}

	// Method to calculate and display total fee
	public void calculateFee(double tuitionFee) {
		double transportFee = distance * ratePerKm; // Calculate transport fee based on distance
		double totalFee = tuitionFee + transportFee;
		displayDetails();
		System.out.println("Distance from College: " + distance + " km");
		System.out.println("Transport Fee: " + transportFee);
		System.out.println("Total Fee: " + totalFee);
	}
}

// Subclass: Hosteler
class Hosteler extends Student {
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
