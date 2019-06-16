package Lab1.Day3.Assignment5;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        String name;
        System.out.println("Enter the username");
        name= sobj.nextLine();
        System.out.println("Hi "+name);
        System.out.println("lowercase is "+name.toLowerCase());
        System.out.println("uppercase is "+name.toUpperCase());
        if(name.startsWith("a") || name.startsWith("A")){
            System.out.println("The name starts with a/A");
        }
        name="Krishna";
        System.out.println("The replaced name is "+name);
        sobj.close();
    }
}
