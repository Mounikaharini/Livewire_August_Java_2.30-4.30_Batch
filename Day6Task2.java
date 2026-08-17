package TheoryClass;

import java.util.Scanner;

public class Day6Task2 {
	public static String positiveOrNegative(int x) {
		if(x>0) {
			return "Positive";
		}
		else if(x<0) {
			return "Negative";
		}
		else if(x==0) {
			return "Neutral";
		}
		else {
			return "Invalid";
		}
	}
	
	public static String leapYearOrNot(int y) {
		if(y%4==0) {
			if(y%400==100 || y%400==200 || y%400==300) {
				return "Not a Leap year";
			}
			else {
				return  "Leap year";
			}
		}
		else {
			return "Not a Leap year";
		}
	}
	public static void function() {
		Scanner s = new Scanner(System.in);
		int n = 2;
		switch (n) {
		case 1: {
			System.out.println("Enter a number : ");
			int x = s.nextInt();
			String a = positiveOrNegative(x);
			System.out.println(a);
		}
		case 2:{
			System.out.println("Enter a number : ");
			int x = s.nextInt();
			String a = leapYearOrNot(x);
			System.out.println(a);
		}
		default:
			System.out.println("Invalid option");
		}
	}
	
	public static void login() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the username: ");
		String n = s.nextLine();
		System.out.println("Enter the password : ");
		int m = s.nextInt();
		if(n.equals("admin") && m==1234) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Invalid username / password");
			login();
		}
	}
	
	
	public static void main(String[] args) {
		login();

		
		
	}

}
