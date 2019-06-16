package Lab1.Day3.Assignment1;

public class Student {
	static int staticCount;
    int studentId=550;
    char studentType;
    String studentName;
    static {
    	staticCount=10;
    }
    Student(){
    	staticCount=staticCount +1;;
        this.studentId=staticCount;
    }
    Student(char sType,String fname,String lname){
        this.studentId= studentId+1;
        this.studentType=sType;
        this.studentName=fname+lname;

    }
    static int getStudentCount() {
    	return staticCount;
    }
    void displayDetails(Student s){
        System.out.println("id is "+s.studentId);
        System.out.println("student type is "+s.studentType);
        System.out.println(("studnet name is "+s.studentName));

    }
  public static void main(String args[]){
      Student studentOne=new Student('D',"Bony","Thomas");
      studentOne.displayDetails(studentOne);
      Student studentTwo=new Student('H',"Dinil","Bose");
      studentTwo.displayDetails(studentTwo);
  }


}
