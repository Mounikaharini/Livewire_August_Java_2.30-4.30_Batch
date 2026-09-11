package TheoryClassOOPS;
//
//interface type1{
//	void add();
//}
//class method implements type1{
//	@Override
//	public void add() {
//		System.out.println("Add");
//	}
//}

//multiple inheritance

interface parent1{
	void parent1method();
}
interface parent2{
	void parent2method();
}
class child implements parent1,parent2{
	@Override
	public void parent2method() {
		System.out.println("parent 2");
	}
	@Override
	public void parent1method() {
		System.out.println("parent 1");
	}
}
public class interfaceTopic {
	public static void main(String[] args) {
		child c = new child();
		c.parent1method();
		c.parent2method();
	}
}
