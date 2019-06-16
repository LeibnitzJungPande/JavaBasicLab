package Lab1.Day2.Assignment3;


	import java.util.Scanner;
	public class Operator {
	    public static void main(String[] args) {
	        Scanner sobj=new Scanner(System.in);
	        String grade;
	        System.out.println("enter Grade");
	        grade=sobj.nextLine();
	        switch(grade.toUpperCase()){
	            case "A":
	                System.out.println("80-100");
	                break;
	            case "B":
	                System.out.println("73-79");
	                break;
	            case "C":
	            	System.out.println("65-72");
	            	break;
	            case "D":
	            	System.out.println("55-64");
	            	break;
	            case "E":
	            	System.out.println("<55");
	            	break;
	            default:
	                System.out.println("grade does not exists");
	        }
	        sobj.close();
	    }
	}


