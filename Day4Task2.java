package TheoryClass;

import java.util.Scanner;

public class Day4Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array declaration
//			
//		int a[];
//		int []b;
//		int[] c;
		
		//c-array
//		int a[]= {1,2,3,4,5};
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		
//		int n = 5;
//		int a[] = new int[n];
//		a[0]=90;
//		a[1]=76;
//		a[2]=54;
//		a[3]=54;
//		a[4]=20;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}
		
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the size of an array :");
//		int n = s.nextInt();
//		
//		int a[] = new int[n];
//		
//		System.out.println("Enter the element : ");
//		for(int i=0;i<a.length;i++) {
//			a[i]=s.nextInt();
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//linear search
		
		System.out.println("Enter the size of an array :");
		int n = s.nextInt(); //size of an array
		
		int a[] = new int[n]; //array declaration
		
		System.out.println("Enter the element : ");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the key element : ");
		int key = s.nextInt(); //key to search
		
		boolean flag = true; //set flag if element not found
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("The element is in "+(i+1)+" Position");
			}
			else {
				flag = false;
			}
		}
		
		if(flag==false) {
			System.out.println("Element not found");
		}
		
		
		
		
		
		
		
		
	}

}

