package Day_06;

import Day_06.CollegeApplication.DayScholar;
import Day_06.CollegeApplication.Hosteler;

public class CollegeAppObj {
    // Main Class
    public static void main(String[] args) {
        // Create an instance of CollegeApplication
        CollegeApplication app = new CollegeApplication();

        // Create a Hosteler object
        Hosteler hosteler = app.new Hosteler("Student1", "H001", "Computer Science", 30000);
        System.out.println("Hosteler Details:");
        hosteler.calculateFee(75000); // Tuition fee for Hosteler

        System.out.println("\n----------------------------\n");

        // Create a DayScholar object
        DayScholar dayScholar = app.new DayScholar("Student2", "D001", "Mechanical Engineering", 20000);
        System.out.println("Day Scholar Details:");
        dayScholar.calculateFee(75000); // Tuition fee for DayScholar
    }
}
