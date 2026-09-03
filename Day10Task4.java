package TheoryClassOOPS;
class Details{
	void detail(String name , int duration , float fees) {
		System.out.println("________________    Details    ________________\n");
		System.out.println("Name          :"+name);
		System.out.println("Duration      :"+duration);
		System.out.println("Fees          :"+fees);
		System.out.println("-----------------------------------------------");
	}
	void detail(int duration ,String name , float fees) {
		System.out.println("________________    Details    ________________\n");
		System.out.println("Name          :"+name);
		System.out.println("Duration      :"+duration);
		System.out.println("Fees          :"+fees);
		System.out.println("-----------------------------------------------");
	}
	void detail(float fees, String name , int duration) {
		System.out.println("________________    Details    ________________\n");
		System.out.println("Name          :"+name);
		System.out.println("Duration      :"+duration);
		System.out.println("Fees          :"+fees);
		System.out.println("-----------------------------------------------");
	}
}
public class polymorphism {
	public static void sum() {
		System.out.println("Output : 0");
	}
	public static void sum(int a) {
		System.out.println("Output : "+a);
	}
	public static void sum(int a , int b) {
		System.out.println("Output : "+(a+b));
	}
	public static void sum(int a , int b , int c) {
		System.out.println("Output : "+(a+b+c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum();
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
		
		Details d = new Details();
		d.detail(15900.905f, "Python", 60);
		d.detail(70, "Java", 13900.4358f);
		d.detail("CCNA", 58, 12900.894375f);
	}

}
