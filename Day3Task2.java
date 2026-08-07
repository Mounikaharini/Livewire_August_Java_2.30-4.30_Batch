package TheoryClass;

import java.util.Scanner;

public class Day3Task2 {

	public static void main(String[] args) {
		/*
		 //Sequence control
		 
		System.out.println("Step 1: Starting the program."); // Executed first       
		int x = 10;                                       				    // Executed second        
		int y = 20;                                      				    // Executed third        
		int sum = x + y;                                 			    // Executed fourth        
		System.out.println("Step 2: The sum is: " + sum); 	    // Executed fifth        
		System.out.println("Step 3: Program finished.");        // Executed last    
		
		
		
		//Scanner ->User Input
		Scanner s = new Scanner(System.in);
		
		byte v1 = s.nextByte();
		System.out.println(v1);
		
		short v2 = s.nextShort();
		System.out.println(v2);
		
		int v3 = s.nextInt();
		System.out.println(v3);
		
		long v4 = s.nextLong();
		System.out.println(v4);
		
		float v5 = s.nextFloat();
		System.out.println(v5);
		
		double v6 = s.nextDouble();
		System.out.println(v6);
		
		char v7 = s.next().charAt(0);
		System.out.println(v7);
		
		boolean v8 = s.nextBoolean();
		System.out.println(v8);
		
		s.nextLine();
		
		String v9 = s.nextLine();
		System.out.println(v9);*/
		
		//selection control
		//1.simple if
		
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int a = s.nextInt();
//		if(a==100) {
//			System.out.println("Yes this is 100");
//		}
		
		
		//if - else
		
//		System.out.println("Enter a number");
//		int a = s.nextInt();
//		if(a==100) {
//			System.out.println("Yes this is 100");
//		}
//		else {
//			System.out.println("No this is not 100");
//		}
		
//		System.out.println("Enter a number");
//		int a = s.nextInt();
//		if(a%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		
		//nested if
		
//		System.out.println("Enter a character");
//		char ch = s.next().charAt(0);
//		if(ch>='a' && ch<='z') {
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//				System.out.println("Vowel");
//			}
//			else {
//				System.out.println("Consonant");
//			}
//		}
//		else {
//			System.out.println("It is not an alphabet");
//		}
		
		
//		int y = 2303;
//		if(y%4==0) {
//			if(y%400==100 || y%400==200 || y%400==300) {
//				System.out.println("Not a Leap year");
//			}
//			else {
//				System.out.println("Leap year");
//			}
//		}
//		else {
//			System.out.println("Not a Leap year");
//		}
		
		//if - else if - else
		
		int x = s.nextInt();
		if(x>0) {
			System.out.println("Positive");
		}
		else if(x<0) {
			System.out.println("Negative");
		}
		else if(x==0) {
			System.out.println("Neutral");
		}
		else {
			System.out.println("Invalid");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
