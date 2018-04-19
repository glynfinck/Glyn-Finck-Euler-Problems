import java.util.LinkedList;

public class problem9 {

	public static void main(String [] args) {
		int a = 1;
		int b = 1;
		int c = 0;
		LinkedList<Integer> squares = new LinkedList();
		for(int i = 1;i < 999;i++) {
			squares.add(i*i);
		}
		
		
		for(a = 1;a < 999;a++) {
			for(b = 1;b < 999;b++) {
				c = 1000 - (a + b);
				if(c > 0 && (a*a + b*b) == c*c) {
					System.out.println("a = " + a + ", b = " + b + ", c = " + c);
					System.out.println("a + b + c = " + (a + b + c));
					System.out.println("a*b*c = " + a*b*c);
				}
			}
		}
	}
}
