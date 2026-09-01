package TheoryClassOOPS;
class class2{
	static int a = 10;
	static void c2() {
		int a = 20;
		System.out.println(a);
		System.out.println("hi im c2");
	}
}
public class class1 {
	static void c1() {
		System.out.println("hi im c1");
	}
	public static void main(String[] args) {
		c1();
		class2 c = new class2();
		c.c2();
		System.out.println(c.a);
	}
}
