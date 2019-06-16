package Lab1.Day4.Assignment4.Problem2;

public class Student extends CourseRegistration{
	protected int studentId;
	    protected char studentType;
	    protected int  feesPerMonth;
	    protected int semesterFees;
	    protected String studentName;
	    Student(int studentId,String cName){
	    	super(cName);
	        this.studentId= studentId; 
	    } 
	    Student(int id,char type, String name,int semFees,String cName){
	    	this(id,cName);
	    	studentType=type;
	    	studentName=name;
	    	semesterFees=semFees;
	    }

}
