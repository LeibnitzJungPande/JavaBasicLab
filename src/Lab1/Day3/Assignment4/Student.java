package Lab1.Day3.Assignment4;

public class Student {
    static int studentId;
    char studentType;
    String studentName;
    Student(){
        studentId=10;
        studentType='F';
    }
    Student(int id,char type,String fName,String lName){
        studentId=id;
        studentType=type;
        studentName=fName+lName;
    }
    void setStudentId(int id){
        studentId=id;
    }
    void setStudentType(char c){
        studentType=c;
    }
    void setStudentName(String fname,String lname){
        studentName=fname+lname;
    }
    int getStudentId(){
        return studentId;
    }
    String getStudentName(){
        return studentName;
    }
    char getStudentType(){
        return studentType;
    }


  public static void main(String args[]){
        Student student= new Student();
        student.setStudentId(5);
        student.setStudentName("james","Cook");
        student.setStudentId(100);
        student.setStudentType('M');
      System.out.println("id="+student.getStudentId());
      System.out.println("name="+student.getStudentName());
      System.out.println("type="+student.getStudentType());
      Student student1=new Student(700,'G',"Tara","Bhattarai");
      System.out.println();
      System.out.println("id="+student1.getStudentId());
      System.out.println("name="+student1.getStudentName());
      System.out.println("type="+student1.getStudentType());
  }


}
