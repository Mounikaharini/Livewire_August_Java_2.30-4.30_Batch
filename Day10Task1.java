package TheoryClassOOPS;

public class constructorLocalChaining {
	constructorLocalChaining(){
		System.out.println("c1");
	}
	constructorLocalChaining(int a){
		this();
		System.out.println("c2");
	}
	constructorLocalChaining(int a , int b){
		this(7);
		System.out.println("c3");
	}
	constructorLocalChaining(int a , int b , int c){
		this(8,5);
		System.out.println("c4");
	}
	
	public static void main(String[] args) {
		constructorLocalChaining c = new constructorLocalChaining(2,5,5);
	}
}



package TheoryClassOOPS;
class c1{
	c1(){
		System.out.println("Im c1");
	}
}
class c2 extends c1{
	c2(){
		System.out.println("Im c2");
	}
	c2(int a , int b){
		System.out.println(a+b);
	}
}
class c3 extends c2{
	c3(){
//		super(2,5);
		System.out.println("Im c3");
	}
}
public class cosntructorGlobalChaining {
	public static void main(String[] args) {
		c3 c = new c3();
	}
}
