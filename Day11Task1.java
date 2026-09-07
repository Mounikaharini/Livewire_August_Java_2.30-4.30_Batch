package TheoryClassOOPS;
class Food{
	public void Count() {
		System.out.println("35000 Categories / types in foods");
	}
}
class nonVeg extends Food{
	@Override
	public void Count() {
		System.out.println("20000 Categories / types in non veg foods");
	}
}
class veg extends Food{
	@Override
	public void Count() {
		System.out.println("15000 Categories / types in non veg foods");
	}
}

class eCommerce{
	public void paymentMethod() {
		System.out.println("Cash");
	}
	public void additionalFeature() {
		System.out.println("No feature");
	}
}
class Amazon extends eCommerce{
	@Override
	public void paymentMethod() {
		System.out.println("Online Payment");
	}
	@Override
	public void additionalFeature() {
		System.out.println("5% Amount added into Wallet");
	}
}
class Blinkit extends eCommerce{
	@Override
	public void paymentMethod() {
		System.out.println("Online Payment");
	}
	@Override
	public void additionalFeature() {
		System.out.println("Free delivery for purchase above 150rs");
	}
}

class Flipkart extends eCommerce{
	@Override
	public void paymentMethod() {
		System.out.println("Online Payment");
	}
	@Override
	public void additionalFeature() {
		System.out.println("Scartch card added into Wallet");
	}
}

class Meesho extends eCommerce{
	@Override
	public void paymentMethod() {
		System.out.println("Online Payment");
	}
	@Override
	public void additionalFeature() {
		System.out.println("10 coins added into Wallet");
	}
}

class output{
	void methodCall(eCommerce ref) {
		ref.paymentMethod();
		ref.additionalFeature();
	}
}
public class Overriding {
	public static void main(String[] args) {
//		Example 1
		
//		Food f = new Food();
//		f.Count();
//		nonVeg n = new nonVeg();
//		n.Count();
//		veg v = new veg();
//		v.Count();
		
		//tight coupling call method
//		eCommerce parent = new eCommerce();
//		parent.paymentMethod();
//		parent.additionalFeature();
//		
//		Amazon child1 = new Amazon();
//		child1.paymentMethod();
//		child1.additionalFeature();
//		
//		Flipkart child2 = new Flipkart();
//		child2.paymentMethod();
//		child2.additionalFeature();
//		
//		Meesho child3 = new Meesho();
//		child3.paymentMethod();
//		child3.additionalFeature();
//		
//		Blinkit child4 = new Blinkit();
//		child4.paymentMethod();
//		child4.additionalFeature();
		
		//loose coupling call method
		
//		eCommerce object ;
//		object = new eCommerce();
//		object.paymentMethod();
//		object.additionalFeature();
//		
//		object = new Amazon();
//		object.paymentMethod();
//		object.additionalFeature();
//		
//		object = new Flipkart();
//		object.paymentMethod();
//		object.additionalFeature();
//		
//		object = new Meesho();
//		object.paymentMethod();
//		object.additionalFeature();
//		
//		object = new Blinkit();
//		object.paymentMethod();
//		object.additionalFeature();
		
		//Simplifying the loose coupling
		
		eCommerce parent = new eCommerce();
		Amazon child1 = new Amazon();
		Flipkart child2 = new Flipkart();
		Meesho child3 = new Meesho();
		Blinkit child4 = new Blinkit();
		output o = new output();
		o.methodCall(parent);
		o.methodCall(child1);
		o.methodCall(child2);
		o.methodCall(child3);
		o.methodCall(child4);
		
	}
}
