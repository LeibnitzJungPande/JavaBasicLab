package Lab1.Day5.Assignment6;

import java.util.Date;

public class MultiWay extends Ticket {
	int denomination;
	int countTrip;
	MultiWay(int d){
		Date todayDate = new Date();
		denomination=d;
		generateMultiTicket(todayDate);
	}
	void generateMultiTicket(Date today) {
		long ltime=today.getTime()+60*24*60*60*1000;
		Date lastDate=new Date(ltime);
		validDate=lastDate.toString();
		System.out.println("Multi way Ticket"+"for "+denomination+"Trips"+" Generated. Starting from"+today.toString()+" Valid through"+validDate);
	}

}
