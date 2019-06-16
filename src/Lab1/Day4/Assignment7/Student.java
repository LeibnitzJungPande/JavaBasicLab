package Lab1.Day4.Assignment7;
public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
   final protected int semesterFees=12000;
    protected int feesPerMonth;
    Student(int studentId){
        this.studentId= studentId; 
    } 
    
    public void setStudentId(int sId) {
    	this.studentId=sId;
    }
    public void setStudentType(char stype) {
    	this.studentType=stype;
    }
    public void setStudentName(String sname) {
    	this.studentName=sname;
    }
    int calculateFees() {
    	return semesterFees/6;
    	
    	
    }
    public void displayDetails() {
    	System.out.println("Student ID :"+studentId);
    	System.out.println("Student type "+studentType);
    	System.out.println("Student Name "+studentName);
    	System.out.println("Fees per month"+calculateFees());
    }
}
   
