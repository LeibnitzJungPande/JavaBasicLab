package Lab1.Day2.Assignment9;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValone=0;
		int intValTwo=0;
		for(short index=0;index<5;index++) {
			if((++intValone>2)||(++intValTwo>2)) {
				intValone++;
				
			}
		}
		System.out.println(intValone+" "+intValTwo);
		System.out.println();
		intValone=5;intValTwo=7;
		System.out.println((((intValTwo*2)%intValone)));
		System.out.println(intValTwo%intValone);
		System.out.println();
		int val1=9;
		int val2=6;
		for(int val3=0;val3<6;val3++,val2--) {
			if(val1>2) {
				val1--;
			}
			if(val1>5) {
				System.out.println(val1+" ");
				--val1;
				continue;
			}
				val1--;
			}
		
		}
	}


