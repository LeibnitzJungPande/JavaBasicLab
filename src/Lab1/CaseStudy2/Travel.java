package Lab1.CaseStudy2;

public class Travel {
	char modeOfTravel;
	int noOfTickets;
	double amount;
	char getModeOfTravel() {
		return modeOfTravel;
	}
	int getNoOfTickets() {
		return noOfTickets;
	}
	double getAmount() {
		return amount;
	}
	void setAmount(double a) {
		amount=a;
	}
	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

}
