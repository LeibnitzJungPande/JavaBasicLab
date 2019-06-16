package Lab1.Day4.Assignment1;

public class Hostelite extends Student{
		private String hostelName;
		private int roomNumber;
		Hostelite(){
			
		}
		Hostelite(int sId,char sType,String sName,double fPerMonth,String hName,int rNumber){
			studentId=sId;
			studentType=sType;
			studentName=sName;
			feesPerMonth=fPerMonth;
			hostelName=hName;
			roomNumber=rNumber;
		}
		String getHostelName() {
			return hostelName;
		}
		int getroomNumber() {
			return roomNumber;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hostelite hobj= new Hostelite(3847,'O',"leibnitz",10000.0,"Lacari",7);
		      System.out.println("id= "+hobj.getStudentId());
		      System.out.println("student type= "+hobj.studentType);
		      System.out.println("name= "+hobj.getStudentName());
		      System.out.println("fees per month = "+hobj.getFees());
		      System.out.println("hostel name= "+hobj.getHostelName());
		      System.out.println("room number= "+hobj.getroomNumber());

	}

}
