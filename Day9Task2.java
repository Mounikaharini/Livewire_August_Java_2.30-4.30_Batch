package TheoryClassOOPS;
//single inheritance
//class parent1{
//	static void c1() {
//		System.out.println("hi");
//	}
//}
//public class inheritance extends parent1{
//	public static void main(String[] args) {
//		c1();
//	}
//}


//multi-level inheritance
//class phone1{
//	static void m1() {
//		System.out.println("Telephone for call");
//	}
//}
//
//class phone2 extends phone1{
//	static void m2() {
//		System.out.println("Button phones for call and text msg");
//	}
//}
//
//class phone3 extends phone2{
//	static void m3() {
//		System.out.println("Smart phones for call , text msg and access social media");
//	}
//}
//
//public class inheritance{
//	public static void main(String[] args) {
//		phone1 p1 = new phone1();
//		p1.m1();
//		
//		phone2 p2 = new phone2();
//		p2.m1();
//		p2.m2();
//		
//		phone3 p3 = new phone3();
//		p3.m1();
//		p3.m2();
//		p3.m3();
//	}
//}

// Hierarchical Inheritance
//class warehouse{
//	static void warehouseproducts() {
//		System.out.println("Dress");
//	}
//}
//
//class amazon extends warehouse{
//	static void amazonProducts() {
//		System.out.println("Phones");
//	}
//}
//
//class nykaa extends warehouse{
//	static void nykaaproducts() {
//		System.out.println("Make up products");
//	}
//}
//
//class meesho extends warehouse{
//	static void meeshoproducts() {
//		System.out.println("Decors , Toys");
//	}
//}
//
//public class inheritance{
//	public static void main(String[] args) {
//		warehouse w = new warehouse();
//		w.warehouseproducts();
//		
//		amazon a = new amazon();
//		a.warehouseproducts();
//		a.amazonProducts();
//		
//		nykaa n = new nykaa();
//		n.warehouseproducts();
//		n.nykaaproducts();
//		
//		meesho m = new meesho();
//		m.warehouseproducts();
//		m.meeshoproducts();
//	}
//}

class calc{
	calc(){
		System.out.println("Calc Opened");
	}
	calc(int i){
		System.out.println(i);
	}
	calc(int i, int j) {
		System.out.println(i+j);
	}
	calc(int i, int j, int k) {
		System.out.println(i+j+k);
	}

}
public class inheritance extends calc{
	public static void main(String[] args) {
		calc c1 = new calc();
		calc c2 = new calc(1);
		calc c3 = new calc(1,2);
		calc c4 = new calc(1,2,3);
	}
}






