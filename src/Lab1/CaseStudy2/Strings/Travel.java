package Lab1.CaseStudy2.Strings;

public class Travel {
	final static int compCode=115;
	static char modeOfTravel;
	int travelCode;
	static int t_flight=101;
	static int t_train=201;
	static int t_bus=301;
	static int uniqueCodef=0;
	static int uniqueCodet=0;
    static int uniqueCodeb=0;
    static int uniqueCode=0;
	Travel(char c){
		travelCode=checkTravel(c);
		codeGenerator(compCode,c,travelCode,uniqueCode);
		
	}
	int checkTravel(char c) {
		if(c=='F') {
			++uniqueCodef;
			uniqueCode=uniqueCodef;
			if(uniqueCodef>9999 &&t_flight<105) {
				uniqueCodef=0;
				return ++t_flight;
			}
			else if(uniqueCodef<=9999 && t_flight<106) {
				return t_flight;	
			}
			else {
				return 0;
			}
		}
		else if(c=='T') {
			++uniqueCodet;
			uniqueCode=uniqueCodet;
			if(uniqueCodet>9999 &&t_train<205) {
				uniqueCodet=0;
				return ++t_train;
			}
			else if(uniqueCodet<=9999 && t_train<206) {
				return t_train;	
			}
			else {
				return 0;
			}
			
		}
		else if(c=='B') {
			++uniqueCodeb;
			uniqueCode=uniqueCodeb;
			if(uniqueCodeb>9999 &&t_bus<305) {
				uniqueCodeb=0;
				return ++t_bus;
			}
			else if(uniqueCodeb<=9999 && t_bus<306) {
				return t_bus;	
			}
			else {
				return 0;
			}
			
		}
		else {
			System.out.println("Invalid travel type");
			return 0;
		}
		
	}
	void codeGenerator(int cCode,char c,int tCode,int uCode) {
		if(tCode==0) {
			System.out.println("Code cannot be generated");
			
		}
		else {
		String output = Integer.toString(uCode);
		String coded;
	    int digits=4;
	    while (output.length() < digits) output = "0" + output;
	    coded=Integer.toString(cCode)+c+Integer.toString(tCode)+output;
	    System.out.println("pattern coded is "+coded);
	}
	}
	
	public static void main(String args[]) {
		
		new Travel('F');
		new Travel('T');
		new Travel('B');
		new Travel('F');
		new Travel('T');
		new Travel('B');
		new Travel('F');
		new Travel('T');
		new Travel('B');
		new Travel('F');
		new Travel('T');
		new Travel('B');
		new Travel('F');
		new Travel('T');
		new Travel('B');
		new Travel('F');
		new Travel('T');
		new Travel('B');
		/*
		for(int i=0;i<49999;i++) {
		
			new Travel('B');
			
		}
		*/
		
	}
}
