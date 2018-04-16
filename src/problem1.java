public class problem1 {
	public static void main(String [] args) {
		int n = 1000;
		int sum = 0;
		for(int k = 1;k < n;k++) {
			if(k%3 == 0 || k%5 == 0) {
				sum = sum + k;
			}
		}
		System.out.println(sum);
	}
}

