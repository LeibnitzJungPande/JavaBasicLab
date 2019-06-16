package Lab1.Day2.Assignment6;

public class UserType {
	String name;
	UserType(String parameterVal){
		name=parameterVal;
	}
	
	UserType(){
		this("student");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserType usertype1=new UserType("Faculty");
		UserType usertype2=new UserType();
		System.out.println(usertype1.name);
		System.out.println(usertype2.name);

	}

}
