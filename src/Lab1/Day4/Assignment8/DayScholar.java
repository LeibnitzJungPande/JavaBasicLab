package Lab1.Day4.Assignment8;

public class DayScholar extends Student{
	String residentialAddress;
	DayScholar(){
		
	}
	DayScholar(int sId,char stype,String sName,double fPerMonth,String rAddress){
		studentId=sId;
		studentType=stype;
		studentName=sName;
		calculateFees(fPerMonth);
		residentialAddress=rAddress;
		
		
	}
	public void calculateFees(double semesterFees) {
		feesPerMonth=semesterFees/6.0;
		
	}
	String getResidentialAddress() {
		return residentialAddress;
	}
	void displayStudentDetails() {
		super.displayStudentDetails();
	      System.out.println("Residential Address is "+getResidentialAddress());
	}
	
}
