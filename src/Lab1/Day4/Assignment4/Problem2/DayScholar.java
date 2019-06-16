package Lab1.Day4.Assignment4.Problem2;

public class DayScholar extends Student {
	private String residentialAddress;
	DayScholar(int studentId,char studentType,String studname,int semfees,String residentialAddress,String cName){
		super(studentId,studentType, studname, semfees,cName);
		this.residentialAddress=residentialAddress;	
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("student id is"+ super.studentId);
		System.out.println("Student name is "+super.studentName);
		System.out.println("Student type is "+super.studentType);
		System.out.println("semester fees is "+super.semesterFees);
		System.out.println("Residential address is "+ residentialAddress);
	}

}
