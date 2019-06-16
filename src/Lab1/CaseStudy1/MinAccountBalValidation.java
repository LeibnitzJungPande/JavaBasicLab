package Lab1.CaseStudy1;

public class MinAccountBalValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account();
		obj.setAmount(5000);
		if(obj.accAmount<500) {
			System.out.println("The balance is below minimum value");
		}
		else {
			System.out.println("The available balance is "+obj.accAmount);
		}
		
	}

}
