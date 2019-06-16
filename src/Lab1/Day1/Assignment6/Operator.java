package Lab1.Day1.Assignment6;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal=10;
		float floatVal=3.0f;
		boolean bool1=true;
		boolean bool2=false;
		boolean bool3=true;
		System.out.println("Arithmetic");
		System.out.println(intVal+"%"+floatVal+"="+(intVal%floatVal));
		System.out.println();
		
		System.out.println("String Concatenation");
		System.out.println("Day"+2+"session");
		System.out.println("Day"+2+3+"\n"+(2+3));
		
		System.out.println();
		System.out.println("Relational Operator");
		System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
		System.out.println();
		
		bool2=false;
		if(bool1||(bool1 &&(bool2=false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("failure");
		}
		System.out.println("bool2 value: "+bool2);

	}

}
