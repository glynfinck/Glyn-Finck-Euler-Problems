import java.util.LinkedList;

public class problem5 {
	public static long factorial(long x) {
		if(x == 1) {
			return 1;
		}
		else return x*factorial(x-1);
	}
	
	public static boolean isStillDivisible(int n,long x) {
		for(int i = 1;i <= n;i++) {
			if(x%i != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		long temp = 0;
		long x = factorial(20);
		System.out.println("20! = " + x);
		for(int i = 2;i <= 20;i++) {
			temp = x/i;
			while(isStillDivisible(20,temp)) {
				x = temp;
				temp = x/i;
			}
			
		}
		System.out.println("Smallest number divisible by the numbers 1 to 20 : " + x);
	}
}
