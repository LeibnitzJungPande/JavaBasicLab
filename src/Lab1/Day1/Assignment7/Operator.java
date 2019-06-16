package Lab1.Day1.Assignment7;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1=false;
		boolean bool2=true;
		boolean bool3=true;
		
		if(bool1 &&(bool1 &&(bool2=false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("failure");
		}
		System.out.println("bool2 value: "+bool2);

	}

}
