
public class problem4 {
	
	public static boolean isPalindrome(int integer) {
	    String intStr = String.valueOf(integer); 
	    return intStr.equals(new StringBuilder(intStr).reverse().toString());
	}
		
	
	public static void main(String [] args) {
		int num = 0;
		int j = 0;
		int i = 0;
		int num_big = 0;
		int i_big = 0;
		int j_big = 0;
		for(i = 999;i > 1;i--) {
			for(j = 999;j > 1;j--) {
				num = i*j;
				if(isPalindrome(num)) {
					if(num_big < num) {
						num_big = num;
						j_big = j;
						i_big = i;
					}
				}
			}
		}
		System.out.println(num_big);
		System.out.println("i = " + i_big + ",  j = " + j_big);
		
		
	}
}
