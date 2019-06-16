package Lab1.Day4.Assignment6;
public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    public void setStudentId(int sId) {
    	this.studentId=sId;
    }
    public void setStudentType(char stype) {
    	this.studentType=stype;
    }
    public void setStudentName(String sname) {
    	this.studentName=sname;
    }
    public void getDetails() {
    	System.out.println("Student ID :"+studentId);
    	System.out.println("Student type "+studentType);
    }
}
   
