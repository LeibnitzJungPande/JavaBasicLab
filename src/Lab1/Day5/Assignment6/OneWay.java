package Lab1.Day5.Assignment6;
import java.util.Date;
public class OneWay extends Ticket{
	String validDate;
	OneWay(String o,String d){
		origin=o;
		destination=d;
		Date date = new Date();
		generateOneWayTicket(date);     
	}
	void generateOneWayTicket(Date d) {
		System.out.println("One way Ticket Generated to "+destination+" Valid through"+d.toString());
	}
		// TODO Auto-generated method stub
		
	
}
