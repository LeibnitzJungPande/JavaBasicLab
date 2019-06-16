package Lab1.Day4.Assignment4;

public class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentId,char studentType,String studname,int semfees,String residentialAddress){
		super(studentId,studentType, studname, semfees);
		this.residentialAddress=residentialAddress;	
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Residential address is "+ residentialAddress);
	}
	

}
