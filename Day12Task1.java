package TheoryClassOOPS;
abstract class Mobile{
	abstract void brand();
	abstract void price();
}
abstract class nothing extends Mobile{
	@Override
	void brand() {
		System.out.println("Nothing 3A");
		System.out.println("8GB RAM , 256GB Internal M/y");
		System.out.println("Black , White");
		System.out.println("Snapdragon Processor");
	}
}
class nothingOffer extends nothing{
	@Override
	void price() {
		System.out.println("Actual Price  : 35000");
		System.out.println("Offered Price :30000 Rs");	
	}
}
public class Abstraction {
	public static void main(String[] args) {
//		Mobile m = new Mobile(); -->Error
		nothingOffer n = new nothingOffer();
		n.brand();
		n.price();
	}
}
