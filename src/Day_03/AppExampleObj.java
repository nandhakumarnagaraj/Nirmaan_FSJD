package Day_03;

import java.time.LocalDate;

public class AppExampleObj {
	public static void main(String[] args) {
		AppForm st1= new AppForm("student1", 22,LocalDate.of(2024, 12, 1), 123654789l, "email@gmail.com");
		AppForm st2= new AppForm();
		AppForm st3= new AppForm();
		st3.setStudentName("student3");
		st2.setStudentName("student2");
		
		st1.getDetails();

	}

}
 