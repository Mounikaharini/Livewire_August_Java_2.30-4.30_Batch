package TheoryClassOOPS;

class Test{
	
	static int a,b;
	
	int c,d;
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	
	static void fun1() {
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	void fun2() {
		System.out.println("instance method");
	}
}

public class staticExceution{
	public static void main(String[] args) {

		Test.fun1();
		
		Test t = new Test();
		t.fun2();
		Test.a= 10;
		Test.b = 20;
		System.out.println(Test.a);
		System.out.println(Test.b);
		t.c=7;
		t.d=90;
		System.out.println(t.c);
		System.out.println(t.d);
		
	}
}

