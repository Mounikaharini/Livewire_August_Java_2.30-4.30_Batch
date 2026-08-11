package TheoryClass;

import java.util.Scanner;

public class Day4Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		int j = 5;
//		while(j>=1) {
//			System.out.println(j);
//			j--;
//		}
//		
//		int x = 1;
//		while(x<=5) {
//			int y = 1;
//			while(y<=5) {
//				System.out.print("* ");
//				y++;
//			}
//			x++;
//			System.out.println();
//		}
//		
//		//count the digit
//		int n = 123;
//		int count = 0;
//		while(n>0) {
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);
//		
//		//sum of digit
//		int m = 9835;
//		int sum = 0;
//		while(m>0) {
//			int r = m%10;
//			sum = sum + r;
//			m = m/10;
//		}
//		System.out.println(sum);
		
		//input - 3675
		//output - 1*11
		//even = * & odd = 1
		
		//reverse a number
//		int a = 1235; //1*11
//		int rev = 0;
//		while(a>0)
//		{
//			int r = a%10;
//			rev = (rev * 10) + r;
//			a=a/10;
//		}
//		
//		/*rev = 5321
//		 * a = 1235
//		 * rev = (0*10) + 5
//		 * 
//		 * a = 123
//		 * rev = (5*10) + 3
//		 * 
//		 * a=12
//		 * rev = (53*10) + 2
//		 * 
//		 * a=1
//		 * rev = (532*10) + 1
//		 * 
//		 * */
//		
//		//convert the data
//		String o = "";
//		while(rev>0) {
//			int r = rev%10;
//			if(r%2==0) {
//				o = o + "*";
//			}
//			else if(rev%2!=0) {
//				o = o + "1";
//			}
//			rev = rev / 10;
//		}
//		System.out.println(o);
		
		
		//palindrome
//
//		int a = 12321; //1*11
//		int a1 = a;
//		int rev = 0;
//		while(a>0)
//		{
//			int r = a%10;
//			rev = (rev * 10) + r;
//			a=a/10;
//		}
//		
//		if(a1==rev) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
		
		//jumping stmt
		
		for(int i = 0;i<=5;i++) {
			if(i==3) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
		
		for(int i=0;i<=5;i++) {
			if(i==3) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		
		//simple login
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			
			System.out.println("Enter the username :");
			String a = sc.nextLine();
			
			System.out.println("Enter the password :");
			int b = sc.nextInt();
			
			sc.nextLine();
			
			if(a.equals("admin") && b==1234) {
				System.out.println("Login Successful");
				break;
			}
			
			else {
				System.out.println("Invalid Username / Password");
				System.out.println("You have "+(3-i)+" Attempt left");
			}
			if(i==3) {
				System.out.println("Possible Attempts are Done today . use 24 hours later");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
