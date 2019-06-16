package Lab1.Day4.Assignment7;

public final class DayScholar extends Student{
	 String residentialAddress;
	 
	 DayScholar(int studentId,char studentType,String studname,int semfees,String residentialAddress){
			super(studentId);
			super.setStudentName(studname);
			super.setStudentType(studentType);
			this.residentialAddress=residentialAddress;	
		}
		void displayDaysDetails() {
			super.displayDetails();
			System.out.println("Residential address is "+ residentialAddress);
		}
		public static void main(String args[]) {
			DayScholar ds= new DayScholar(1,'D',"Ram",12000,"talbit");
			ds.displayDaysDetails();
		}
}
	