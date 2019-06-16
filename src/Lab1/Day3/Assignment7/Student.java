package Lab1.Day3.Assignment7;
public class Student {
    int studentId;
    String residentialStatus;
    long  feesPerMonth;
    String studentName;
    Student(){
        studentId=1;
        residentialStatus="Hostelite";
        feesPerMonth=500;
        studentName="David";  
    } 
    void setStudentId(int id){
        studentId=id;
    }
    void setResidentialStatus(String s){
        residentialStatus=s;
    }
    void setfeesPerMonth(long l){
    	if(residentialStatus=="hostelite")
    	{
    		feesPerMonth=0;
    	}
    	else {
    		feesPerMonth=l;
    	}
        
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
    long getFees() {
    	return feesPerMonth;
    }


  public static void main(String args[]){
        Student student= new Student();
        student.setStudentId(Integer.parseInt(args[0]));
        student.setStudentName(args[1],args[2]);
        student.setResidentialStatus(args[3].toLowerCase());
        student.setfeesPerMonth(Long.parseLong(args[4]));
       
        
      System.out.println("id="+student.getStudentId());
      System.out.println("name="+student.getStudentName());
      System.out.println("fees="+student.getFees());
      System.out.println("res_status"+student.getResidentialStatus());
     
  }


}
