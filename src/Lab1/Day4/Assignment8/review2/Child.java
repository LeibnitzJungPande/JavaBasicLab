package Lab1.Day4.Assignment8.review2;

public class Child extends Parent{
	private int val;
	public void setVal(int num) {
		val=num;
	}
	public int getVal() {
		return val;
	}
	public void display() {
		super.display();
		System.out.println("Value :"+getVal());
	}
}
