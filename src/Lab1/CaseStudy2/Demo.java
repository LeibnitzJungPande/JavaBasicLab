package Lab1.CaseStudy2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sCharge,tCharge;
		Travel obj = new Travel();
		obj.setModeOfTravel('F');
		obj.setNoOfTickets(3);
		if(obj.modeOfTravel=='F') {
			sCharge=500;
		}
		else if(obj.modeOfTravel=='T') {
			sCharge=100;
		}
		else {
			sCharge=50;
		}
		tCharge=sCharge*obj.noOfTickets;
		System.out.println("The total charge is "+tCharge);
	}

}
