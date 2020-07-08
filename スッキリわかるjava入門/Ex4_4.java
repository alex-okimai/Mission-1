package j4;

import java.util.Scanner;

public class Ex4_4 {
	
	public static void main(String[] args) {
		int[] numbers = {3,4,9};
		System.out.println("一桁の数字を入力してください。");
		Scanner Scanner = new Scanner(System.in);
		int input = Scanner.nextInt();
		for(int i : numbers) {
			if(i == input) {
				System.out.println("あたり！");
			}		
		}
	}
}
