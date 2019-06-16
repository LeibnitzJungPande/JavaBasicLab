package Lab1.Day4.Assignment4.Problem2;

public class CourseRegistration {
	static protected int regId;
	protected String courseName;
	CourseRegistration(){
		regId++;
	}
	CourseRegistration(String cName){
		this();
		courseName=cName;
	}
	public void displayDetails() {
		System.out.println("Registration Id :"+regId);
		System.out.println("CourseName :"+courseName);
	}

}
