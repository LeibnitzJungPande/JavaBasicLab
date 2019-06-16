package Lab1.Day4.Assignment5;

public class DayScholar extends PostGradStudent{
	 String residentialAddress;
	
	DayScholar(int pCourseId,String pCourseName,int pcourseFee,int sid,char sType,String sName,String rAddress){
		super(pCourseId,pCourseName,pcourseFee,sid, sType,sName);
		this.residentialAddress=rAddress;	
	}
	int calculateFees() {
		 int fees=postCoursefees/6;
		 return fees;
	}
	int getfeedetail() {
		return calculateFees();
	}
	public static void main(String args[]) {
		DayScholar ds= new DayScholar(5,"OOP",16000,1001,'D',"Manu","No 32/3 Vijayanagar");
		System.out.println("student id="+studentId);
		System.out.println("Student type= "+ds.studentType);
		System.out.println("Student name"+ds.studentName);
		System.out.println("Course id ="+ds.getpostCourseId());
		System.out.println("Course name="+ds.getpostCoursename());
		System.out.println("Course fees="+ds.getpostCourseFees());
		System.out.println("Course fees detail ="+ds.getfeedetail());
		
	}

}
