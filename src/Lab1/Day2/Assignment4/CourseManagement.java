package Lab1.Day2.Assignment4;

public class CourseManagement {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setStudentId(5);
        student1.setStudentType('B');
        System.out.println("The id of the student is "+student1.getStudentId());
        System.out.println("The Type of the student is "+student1.getStudentType());
    }

}
