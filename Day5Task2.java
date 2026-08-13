package TheoryClass;

public class Day5Task2 {
	
	public static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
//	void addition() {
//		System.out.println(23+125);
//	}
	
	public static void main(String[] args) {
//		add();
//		add();
//		add();
//		add();
//		add();
//		Day5Task2 d = new Day5Task2();
		//d.addition();
		
		f1();
		
		int c = f2();
		System.out.println(c);
		
		f3(10,20);
		
		int d = f4(10,35);
		System.out.println(d);
	}
	
	//without return without parameter
	public static void f1() {
		int a = 20;
		int b = 90;
		System.out.println(a+b);
	}
	
	//with return without parameter
	public static int f2() {
		int a = 20;
		int b = 90;
		return a+b;
	}
	
	//with return without parameter
	public static void f3(int a,int b) {
		System.out.println(a+b);
	}
	
	//with return with parameter
	public static int f4(int a,int b) {
		return a+b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
