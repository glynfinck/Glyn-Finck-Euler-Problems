
public class problem2 {
	public static void main(String [] args) {
		int prev = 0;
		int curr = 1;
		int next = 1;
		int n = 4000000;
		int sum = 0;
		while(next < n) {
			if(next%2 == 0) {
				sum = sum + next;
			}
			System.out.print(next + " ");
			next = prev + curr;
			prev = curr;
			curr = next;
		}
		System.out.println("\n" +sum);
	}
}
