import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		   Scanner scan = new Scanner(System.in);
//	        System.out.println("请输入割圆次数：");
//	        int n = scan.nextInt();
//	        cut(n);
//	}
// 
//	private static void cut(int n) {
//		double y = 1.0;
//		for(int i = 0; i <= n; i++) {
//			double π = 3 * Math.pow(2, i) * y;
//			System.out.println()
//		}
		double sum = 1 ; 
		for(int a = 3; a <=99; a = a + 2) {
			if((a/2)%2 == 1) {
			sum = sum - 1.0/a;
			
			}else{
			sum = sum +1.0/a;	
			}
			
		}
		double pai = 4 * sum;
		
		System.out.println(pai);
	}
}
