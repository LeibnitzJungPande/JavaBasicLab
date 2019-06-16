package Lab1.Day4.Assignment3;

public class DayScholar extends Student{
	String residentialAddress;
	DayScholar(){
		
	}
	DayScholar(int sId,char stype,String sName,double fPerMonth,String rAddress){
		studentId=sId;
		studentType=stype;
		studentName=sName;
		feesPerMonth=fPerMonth;
		residentialAddress=rAddress;
		
	}
	String getResidentialAddress() {
		return residentialAddress;
	}
	void displayStudentDetails() {
		super.displayStudentDetails();
	      System.out.println("Residential Address is "+getResidentialAddress());
	}
	
}
