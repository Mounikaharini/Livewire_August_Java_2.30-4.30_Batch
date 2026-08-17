package TheoryClass;

import java.util.Scanner;

public class Day6Task3 {
	static void UpperAndLowerCount() {

		int u = 0;
		int l = 0;
		int t = 0;
		String a = "AlphabetS";
		for(int i=0;i<a.length();i++) {
			t++;
			char x = a.charAt(i);
			if(x>=65 && x<=90) {
				u++;
			}
			else if(x>=97 && x<=122) {
				l++;
			}
		}
		
		System.out.println("Upper Count : "+u);
		System.out.println("Lower Count : "+l);
		System.out.println("Total Count : "+t);
	}
	
	static void PasswordValidator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password : ");
		String a = sc.nextLine();
		int u = 0;
		int l = 0;
		int s = 0;
		int n = 0;
		int t = 0;
		for(int i=0;i<a.length();i++) {
			char x = a.charAt(i);
			t++;
			if(x>=65 && x<=90) {
				u++;
			}
			else if(x>=97 && x<=122) {
				l++;
			}
			else if(x>=48 && x<=57) {
				n++;
			}
			else {
				s++;
			}
		}
		if(t>=8) {
			if(u>=1) {
				if(l>=1) {
					if(n>=1) {
						if(s>=1) {
							System.out.println("It is a Strong Password");
						}
						else {
							System.out.println("Add atleast one symbol");
						}
					}
					else {
						System.out.println("Add atleast one Numeric letter");
					}
				}
				else {
					System.out.println("Add atleast one Lowercase letter");
				}
			}
			else {
				System.out.println("Add atleast one Uppercase letter");
			}
		}
		else {
			System.out.println("Add atleast Eight characters");
		}
	}
	
	public static void main(String[] args) {
//		
//		String a1 = "hi";
//		System.out.println(a1);
//		String a2 = new String("hi");
//		System.out.println(a2);
//		StringBuilder a3 = new StringBuilder("hello");
//		System.out.println(a3);
//		a3.append(" world");
//		System.out.println(a3);
//		
//		StringBuffer a4 = new StringBuffer("hello");
//		System.out.println(a4);
//		a3.append(" world");
//		System.out.println(a4);
//		
//		
//		String a = "hello";
//		for(int i=0;i<a.length();i++) {
//			System.out.println(a.charAt(i));
//		}
		
		//upper case , lower case , total 
		PasswordValidator();
	}

}
