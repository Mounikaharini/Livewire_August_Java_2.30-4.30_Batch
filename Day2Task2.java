package TheoryClass;

public class Day2Task2 {

	public static void main(String[] args) {
		//arithmetic operator
		int a = 7895;
		int b = 5363;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//assignment operator
		int c = 10;
		c+=20;
		System.out.println(c);
		c-=20;
		System.out.println(c);
		c*=2;
		System.out.println(c);
		c/=4;
		System.out.println(c);
		c%=9;
		System.out.println(c);
		
    	//Comparison / relational operator
		int x = 90;
		int y = 90;
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		
		//logical operator
		//and / or / not
//		and
//		cond1  cond2   op
//		true   true   true
//		true   false  false
//		false  true   false
//		false  false  false
//		
//		or
//		cond1  cond2   op
//		true   true   true
//		true   false  true
//		false  true   true
//		false  false  false
//		
//		not
//		cond    op
//		true   false
//		false  true
		
		int h = 90;
		int j = 97;
		System.out.println(h==91 && j==97);
		System.out.println(h==91 || j==97);
		System.out.println(!(h==91 && j==97));
		
		
		//unary operator
		int s = -98;
		int t = -s; // -s -> -(-98) -> = 98
		System.out.println(s);
		System.out.println(t);
		
		
		int o = 86;
		System.out.println(o++ + o++ + ++o + ++o);
		System.out.println(++o);
		System.out.println(o++);
		
		System.out.println(--o);
		System.out.println(o--);
		
		//ternary operator
		int l = 90;
		String op = (l%2==0)?"Even":"Odd";
		System.out.println(op);
		
		
		
		
		
		
	}

}
