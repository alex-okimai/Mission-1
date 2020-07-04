public class Ex2_1 {

	public static void main(String[] args) {
		double sum = 1 ; 
		
		// a为分母
		for (int a = 3; a <= 99; a = a + 2) {
			if ((a / 2) % 2 == 1) {
				sum = sum - 1.0 / a;
			} else {
				sum = sum + 1.0 / a;	
			}	
		}
		double pai = 4 * sum;	
		System.out.println(pai);
	}
}
