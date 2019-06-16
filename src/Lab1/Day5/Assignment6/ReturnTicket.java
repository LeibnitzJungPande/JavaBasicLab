package Lab1.Day5.Assignment6;

import java.util.Date;

public class ReturnTicket extends Ticket {
	
	ReturnTicket(String o,String d){
		origin=o;
		destination=d;
		Date todayDate = new Date();
		generateTwoWayTicket(todayDate);   
		
	}
	void generateTwoWayTicket(Date today) {
		long ltime=today.getTime()+7*24*60*60*1000;
		Date lastDate=new Date(ltime);
		validDate=lastDate.toString();
		System.out.println("Two way Ticket Generated for"+origin+"to"+destination+" Starting from"+today.toString()+" Valid through"+validDate);
	}
	
}
