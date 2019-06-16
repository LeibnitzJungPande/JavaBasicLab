package Lab1.Day2.Assignment1;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal = 100;
        byte byteVal= (byte) intVal;
        byte a = 127;
        byte b = -128;
        byte c = (byte)(a + b);

        System.out.println("sum=" + c);
	}

}
