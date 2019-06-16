package Lab1.Day4.Assignment8.review5;

public class B extends A {
public void methodOne(int i) {
		System.out.println("class b method 1");
	}
	public void methodTwo(int i) {
		System.out.println("class b method 2");
	}
	public static void methodThree(int i) {
		System.out.println("static class b method 3");
		
	}
	public static void methodFour(int i) {
		System.out.println("static class b method 4");
	}
	public static void main(String args[]) {
		A aobj=new B();
		aobj.methodOne(1);
		aobj.methodTwo(2);
		B.methodFour(3);
		B.methodThree(3);
		
		A bobj=new A();
		bobj.methodOne(1);
		bobj.methodTwo(2);
		A.methodFour(3);
		A.methodThree(3);
		
	}

}
