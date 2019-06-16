package Lab1.Day4.Assignment3;



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
    void setStudentType(char c) {
    	studentType=c;
    }
    void setStudentId(int id){
        studentId=id;
    }
    void setStudentName(String fname,String lname){
        studentName=fname+" "+lname;
    }
    void setFeePerMonth(double f) {
    	feesPerMonth=f;
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
    double getFeesPermonth() {
    	return feesPerMonth;
    }
    void displayStudentDetails() {
	      System.out.println("id= "+getStudentId());
	      System.out.println("student type= "+getStudentType());
	      System.out.println("name= "+getStudentName());
	      System.out.println("fees per month = "+getFees());
	      
    }
    public static void main(String args[]) {
    	System.out.println("Enter your choice dayscholar/hostelite");
    	String choice=args[0].toLowerCase();
    	Student student;
    	if(choice.equals("dayscholar")) {
    		student=new DayScholar(1,'G',"Hari Baniya",5000,"Bussey");
    		student.displayStudentDetails();
    	}
    	else {
    		student=new Hostelite(2,'B',"Rameswor",8000,"Talbot",115);
    		student.displayStudentDetails();
    	}
	}
}
