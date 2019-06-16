package Lab1.Day3.Assignment8;

public class Student {
    int studentId;
    char studentType;
    String residentialStatus;
    double  feesPerMonth;
    String studentName;
    Student(){
        studentId=1;
        residentialStatus="Hostelite";
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
    void setResidentialStatus(String s){
        residentialStatus=s;
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
    String getResidentialStatus(){
        return residentialStatus;
    }
    String getFees() {
    	String s;
    	s= Double.toString(feesPerMonth);
    	return s;
    }
    char getStudentType() {
    	return studentType;
    }
    void calculateFees(double semfees) {
    	feesPerMonth=semfees/6.0;
    }
    void calculateFees(double semfees,double hosfees) {
    	feesPerMonth=semfees/6.0;
    	feesPerMonth=feesPerMonth+hosfees;
    }

  public static void main(String args[]){
        Student student= new Student(1,'H',"David","Wingfield");
        student.setResidentialStatus(args[0]);
       String response;
       response= student.getResidentialStatus();
       if(response.equals("hostelite")) {
    	   student.calculateFees(500,600);
       }
       else {
    	   student.calculateFees(500);
       }
      
       
        
      System.out.println("id= "+student.getStudentId());
      System.out.println("name= "+student.getStudentName());
      System.out.println("fees per month = "+student.getFees());
      System.out.println("res_status = "+student.getResidentialStatus());
     
  }


}
