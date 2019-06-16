package Lab1.Day2.Assignment9;

public class Student {
    int studentId=550;
    char studentType;
    String studentName;
    Student(){
        this.studentId++;
    }
    Student(char sType,String fname,String lname){
        this.studentId= studentId+1;
        this.studentType=sType;
        this.studentName=fname+lname;

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
