package pack;

import java.util.Scanner;

interface calculator{
	public void add();
	public void sub();
	public void mul();
	public void div();
}
class calc implements calculator{
	int x = 20;
	private int a;
	private int b;
	private int c;
	private int output;
	calc(int a, int b){
		this.a=a;
		this.b=b;
	}
	calc(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public calc() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void add() {
		this.output = this.a+this.b+this.c;
	}	
	@Override
	public void sub() {
		this.output = this.a-this.b-this.c;
	}
	@Override
	public void mul() {
		this.output = this.a*this.b*this.c;
	}
	@Override
	public void div() {
		this.output = this.a/this.b/this.c;
	}
	public int output() {
		return this.output;
	}
}
public class m {
	public static void choice(calc ca,Scanner s) {
		System.out.println("Enter the Number of Inputs Give (2/3) :");
		int n = s.nextInt();
		if(n==2) {
			System.out.println("Enter the first Value :");
			int a = s.nextInt();
			System.out.println("Enter the second Value :");
			int b = s.nextInt();
			ca = new calc(a,b);
			outputCalculation(ca,s);
		}
		else if(n==3){
			System.out.println("Enter the first Value :");
			int a = s.nextInt();
			System.out.println("Enter the second Value :");
			int b = s.nextInt();
			System.out.println("Enter the first Value :");
			int c = s.nextInt();
			ca = new calc(a,b,c);
			outputCalculation(ca,s);
		}
	}
	public static void outputCalculation(calc c,Scanner s) {
		
		System.out.println("The Available Options Are : ");
		System.out.println("-----------------------------------------------------\n");
		String choiceData[] = {"Addition","Subtraction","Multiplication","Division"};
		for(int i=0;i<choiceData.length;i++) {
			System.out.println("For "+choiceData[i]+" Enter "+(i+1));
		}
		System.out.println("Enter the choice : ");
		int ch = s.nextInt();
		if(ch==1) {
			c.add();
			System.out.println("--------------------------------------------------");
			System.out.print("Your Output is : ");
			System.out.println(c.output());
		}
		else if(ch==2) {
			c.sub();
			System.out.println("--------------------------------------------------");
			System.out.print("Your Output is : ");
			System.out.println(c.output());
		}
		else if(ch==3) {
			c.mul();
			System.out.println("--------------------------------------------------");
			System.out.print("Your Output is : ");
			System.out.println(c.output());
		}
		else if(ch==4) {
			c.div();
			System.out.println("--------------------------------------------------");
			System.out.print("Your Output is  : ");
			System.out.println(c.output());
		}
		else {
			
			System.out.println("Invalid Choice");
		}
	}
	public static void greet() {
		System.out.println("--------------   Welcome To Calculator --------------");
		Scanner s = new Scanner(System.in);
		calc ca = new calc();
		choice(ca,s);
	}
	public static void main(String[] args) {
		while(true) {
			greet();
		}
	}
}
