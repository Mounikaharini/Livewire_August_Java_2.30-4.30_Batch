package TheoryClass;

public class Day3Task4 {

	public static void main(String[] args) {
		
		//iterative control
		
		//Entry check loop
		//for loop
		
		/*It is an entry-controlled loop, 
		meaning the condition is checked 
		before the loop's body executes.*/
		
//		for(int i=1;i<=5;i++) {
//			System.out.println(i);
//		}
//		
//		i	i<=5	T/F	op	i++
//		1	1<=5	T	1	2
//		2	2<=5	T	2	3
//		3	3<=5	T	3	4
//		4	4<=5	T	4	5
//		5	5<=5	T	5	6
//		6	6<=5	F	--> Exit 	
		
		
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
