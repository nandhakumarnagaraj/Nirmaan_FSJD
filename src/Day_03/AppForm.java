package Day_03;

import java.time.LocalDate;


public class AppForm {
	String studentName;
	int studentAge;
	LocalDate doj;
	long mobileno;
	String email;

	public AppForm(String studentName, int studentAge, LocalDate doj, long mobileno, String email) {
		super();
		this.studentName = studentName;
		this.doj = doj;
		this.studentAge = studentAge;
		this.mobileno = mobileno;
		this.email = email;
	}

	public AppForm() {
		super();
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void getDetails() {

		System.out.println("AppForm [studentName=" + studentName + ", studentAge=" + studentAge + ", doj=" + doj
				+ ", mobileno=" + mobileno + ", email=" + email + "]");
	}
}
