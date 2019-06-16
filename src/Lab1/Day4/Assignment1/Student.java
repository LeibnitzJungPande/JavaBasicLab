package Lab1.Day4.Assignment1;

public class Student {
    int studentId;
    char studentType;
    double  feesPerMonth;
    String studentName;
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
