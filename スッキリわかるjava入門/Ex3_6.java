package J3;

public class Ex3_6 {

	public static void main(String[] args) {
		System.out.println("数あてゲーム");
		int ans = new java.util.Random().nextInt(10);
		for(int a = 0 ; a < 5 ; a++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();	
			if(num == ans) {
				System.out.println("あたり！！");
				break;
			} else{
				System.out.println("違います！");
			}
		}
		System.out.println("ゲーム終了");
	}

}
