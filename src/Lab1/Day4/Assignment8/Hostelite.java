package Lab1.Day4.Assignment8;

public class Hostelite extends Student{
		String hostelName;
		int roomNumber;
		Hostelite(){
			
		}
		public void calculateFees(double semesterFees) {
			feesPerMonth=semesterFees/6.0;
			feesPerMonth=feesPerMonth+1200;
			
		}
		Hostelite(int sId,char sType,String sName,double fPerMonth,String hName,int rNumber){
			studentId=sId;
			studentType=sType;
			studentName=sName;
			calculateFees(fPerMonth);
			hostelName=hName;
			roomNumber=rNumber;
		}
		String getHostelName() {
			return hostelName;
		}
		int getroomNumber() {
			return roomNumber;
		}
		double getfeePm() {
			return feesPerMonth;
		}
		void displayStudentDetails() {
			super.displayStudentDetails();
			System.out.println("hostel name= "+getHostelName());
		      System.out.println("room number= "+getroomNumber());
			
		}
	

}
