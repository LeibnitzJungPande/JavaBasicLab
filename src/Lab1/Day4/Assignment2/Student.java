package Lab1.Day4.Assignment2;

public class Student {
    protected int studentId;
    protected char studentType;
    protected double  feesPerMonth;
    protected String studentName;
    Student(){
        studentId=1;
        feesPerMonth=500;
        studentName="David";  
    } 
    Student(int id,char type, String fname, String lname){
    	studentId=id;
    	studentType=type;
    	studentName=fname+" "+lname;
    }
    void setFeesPerMonth(double f) {
    	feesPerMonth=f;
    }
    void setStudentType(char c) {
    	studentType=c;
    }
    void setStudentId(int id){
        studentId=id;
    }
    void setStudentName(String fname,String lname){
        studentName=fname+" "+lname;
    }
    int getStudentId(){
        return studentId;
    }
    String getStudentName(){
        return studentName;
    }
    String getFees() {
    	String s;
    	s= Double.toString(feesPerMonth);
    	return s;
    }
    char getStudentType() {
    	return studentType;
    }
}
