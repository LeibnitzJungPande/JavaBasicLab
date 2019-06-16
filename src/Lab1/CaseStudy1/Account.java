package Lab1.CaseStudy1;

public class Account {
	int accAmount;
	int accNo;
	String custName;
	int getAccNo() {
		return accNo;
	}
	int getAmount() {
		return accAmount;
	}
	String getCustName() {
		return custName;
	}
	void setAccNo(int a) {
		accNo=a;
	}
	void setAmount(int a) {
		accAmount=a;
	}
	void setCustName(String n) {
		custName=n;
	}

}
