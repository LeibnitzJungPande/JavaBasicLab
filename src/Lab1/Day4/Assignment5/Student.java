package Lab1.Day4.Assignment5;
public class Student {
    static int studentId;
    char studentType;
    String studentName;
    Student(){
        studentId= studentId+1; 
    } 
    Student(int id,char type, String name){
    	this();
    	studentType=type;
    	studentName=name;
    	
    }
}
