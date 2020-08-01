package j15;

public class Ex15_3 {

	public static void main(String[] args) {
		try {
		int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("例外が出ました");
		}
	}
}
