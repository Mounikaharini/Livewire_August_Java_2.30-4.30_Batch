package TheoryClass;

public class Day8Task1 {
	public static void eer1() {
		try
		{
		int a = 10;
		int b = 0;
		System.out.print(a/b);
		}
		catch(ArithmeticException e)
		{
		throw e;
		}

	}
	public static void fun () throws Exception{
		System.out.println("Program Started");
		try{
			System.out.println(9/3);}
		catch(Exception e){
			System.out.println("Error");}
		finally{
			System.out.println("Program Finished");
		}}

	public static void main(String[] args) {
		try {
			eer1();
		}
		catch(Exception e) {
			System.out.println("hi");
		}
//		fun();
	}

}
