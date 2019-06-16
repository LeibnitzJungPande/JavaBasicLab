package Lab1.Day2.Assignment7;

public class passByVal {
	public static void main(String args[]) {
		int sId=25;
        passByVal val=new passByVal();
        System.out.println(sId);
        val.passTheValueMethod(sId);
        System.out.println("The sId are "+sId);
        Student s =new Student();
        passTheValueMethod1(s);
        System.out.println("the value after the sid is"+s.studentId);
    }
    public void passTheValueMethod(int sIdd){
        sIdd=10;
        System.out.println("The value of sid is "+sIdd);
    }
    public static  void passTheValueMethod1(Student sIdd){
        sIdd.studentId=10;
    }


}
