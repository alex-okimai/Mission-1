import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("【紬】そ、それがネコの宿命とあらば、撫でられてみせますっ");
		System.out.println("【Alex】じゃ、じゃあ");
		System.out.println("1.頭を撫でる");
		System.out.println("2.首を撫でる");
		System.out.println("3.おっぱいを撫でる");
		int a = input.nextInt();
		if (a == 1) {
			System.out.println("頭を撫でてみるか。");
		} else if (a == 2) {
			System.out.println("ネコだし、首を撫でてみるか。");
		} else if (a == 3) {
			System.out.println("よし、おっぱいを撫でよう。");
		}
	}
}
