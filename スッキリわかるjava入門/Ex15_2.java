package j15;

public class Ex15_2 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("例外を出ました。");
			System.out.println("--スタックトレース(ここから)");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)");
		}
	}
}
