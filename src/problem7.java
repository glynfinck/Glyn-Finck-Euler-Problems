
public class problem7 {
	public static boolean isPrime(int x) {
		for(int i = 2;i < x;i++) {
			if(x%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String [] args) {
		int n = 10001;
		int j = 2;
		int i = 0;
		while(i < n) {
			if(isPrime(j)) {
				i++;
			}
			j++;
		}
		
		System.out.println(j+1);
	}
}
