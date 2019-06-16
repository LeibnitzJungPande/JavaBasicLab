package Lab1.Day4.Assignment4;
public class Student {
    protected int studentId;
    protected char studentType;
    protected int  feesPerMonth;
    protected int semesterFees;
    protected String studentName;
    Student(int studentId){
        this.studentId= studentId; 
    } 
    Student(int id,char type, String name,int semFees){
    	this(id);
    	studentType=type;
    	studentName=name;
    	semesterFees=semFees;
    	feesPerMonth=semesterFees/6;
    }
    void displayDetails() {
	      System.out.println("id= "+studentId);
	      System.out.println("student type= "+studentType);
	      System.out.println("name= "+studentName);
	      System.out.println("fees per month = "+feesPerMonth);
	      System.out.println("Semester Fee = "+semesterFees);
	      
  }
}
