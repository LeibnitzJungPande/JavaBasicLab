package Lab1.Day2.Assignment5;

public class Student {
    int studentId;
    char studentType;
    char k;
    Student(){
        studentType='F';
        studentId=10;

    }
    void setStudentId(int id){
        studentId=id;
    }
    void setStudentType(char type){
        studentType=type;
    }
    int getStudentId(){
        return studentId;
    }
    char getStudentType(){
        return studentType;
    }


}
