package TheoryClassOOPS;
class bank{
	private int accNum ;
	private int atm;
	int x = 10;
	public void setdata(int a ,int b) {
		this.accNum = a;
		this.atm = b;
	}
	public int getAccNum() {
		return this.accNum;
	}
	public int getAtm() {
		return this.atm;
	}
}


class bank2{
	private int accNum ;
	private int atm;
	int x = 10;
	bank2(int accNum ,int atm) {
		this.accNum = accNum;
		this.atm = atm;
	}
	public int getAccNum() {
		return this.accNum;
	}
	public int getAtm() {
		return this.atm;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		bank b = new bank();
		b.setdata(98474, 1234);
		System.out.println(b.getAccNum());
		System.out.println(b.getAtm());
//		System.out.println(b.x);
//		System.out.println(b.atm);
		
		bank2 b2 = new bank2(1984656548,2399);
		System.out.println(b2.getAccNum());
		System.out.println(b2.getAtm());
	}
}
