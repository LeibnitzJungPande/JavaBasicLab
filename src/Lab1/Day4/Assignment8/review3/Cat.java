package Lab1.Day4.Assignment8.review3;

public class Cat extends Animal{
	
	public static void testClassMethod() {
		System.out.println("The Class method is in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method is in Cat");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat mycat=new Cat();
		Animal myanimal=mycat;
		Animal.testClassMethod();
		myanimal.testInstanceMethod();

	}

}
