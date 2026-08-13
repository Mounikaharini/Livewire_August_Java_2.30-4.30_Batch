package TheoryClass;

import java.util.Scanner;

public class Day5Task1 {

	public static void main(String[] args) {
		
		//1-D array
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter the size of an array :");
//		int n = input.nextInt();
//		input.nextLine();
//		String a[] = new String[n];
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print("Enter The Data for "+(i+1)+" : ");
//			a[i]=input.nextLine();
//			System.out.println();
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		
//		System.out.println("Enter the size of an row :");
//		int row = input.nextInt();
//	
//		System.out.println("Enter the size of an column :");
//		int col = input.nextInt();
//		
//		int a[][] = new int[row][col];
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.println("Enter the data for row "+(i+1)+" column "+(j+1));
//				a[i][j]=input.nextInt();
//			}
//		}
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		//sum of the elements in an array
		 
		//input = 5 6 9 8 0 
		//output = 28 -> total
		//odd = 14
		//even = 14
		
//
//		System.out.println("Enter the size of an array :");
//		int n = input.nextInt();
//		
//		int a[] = new int[n];
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print("Enter The Data for "+(i+1)+" : ");
//			a[i]=input.nextInt();
//		}
//		System.out.println();
//		
//		int value = 0;
//		int odd = 0;
//		int even = 0;
//		
//		for(int i=0;i<a.length;i++) {
//			value = value + a[i];
//			
//			if(a[i]%2==0) {
//				even = even + a[i];
//			}
//			else {
//				odd = odd + a[i];
//			}
//		}
//		
//		System.out.println(value);
//		System.out.println(odd);
//		System.out.println(even);
		
		
		System.out.println("Enter the size of an array :");
		int n = input.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter The Data for "+(i+1)+" : ");
			a[i]=input.nextInt();
		}
		System.out.println();
		
		int value = 0;
		int odd = 0;
		int even = 0;
		
		for(int i=0;i<a.length;i++) {
			value = value + a[i];
			
			if(a[i]%2==0) {
				even = even + 1;
			}
			else {
				odd = odd + 1;
			}
		}
		
		System.out.println("Total number of odd values: " + odd);
		System.out.println("Total number of even values: " + even);
		
		
		
		

	}

}
