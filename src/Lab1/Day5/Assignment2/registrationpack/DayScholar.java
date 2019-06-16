package Lab1.Day5.Assignment2.registrationpack;
import Lab1.Day5.Assignment2.studentpack.Student;
public class DayScholar extends Student{
	private String residentialAddress;
	public void setResAddress(String resAddress) {
		this.residentialAddress=resAddress;
	}
	public void getDetails() {
		System.out.println("Student id:"+studentId);
		System.out.println("Student type:"+studentType);
		System.out.println("Student Name:"+studentName);
	}

}
