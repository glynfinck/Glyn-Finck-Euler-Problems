
public class problem6 {
	public static void main(String [] args) {
		int n = 100;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1;i <= 100;i++) {
			sum1 = sum1 +  i*i;
			sum2 = sum2 + i;
		}
		sum2 = sum2*sum2;
		System.out.println(sum2 - sum1);
	}
}
