package j4;

public class Ex4_2 {

	public static void main(String[] args) {
		int[] moneyList = new int[3];
		moneyList[0] = 121902;
		moneyList[1] = 8302;
		moneyList[2] = 55100;
//		int[] moneyList = {121902,8302,55100};	
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i] + ",");
		}
		for(int m : moneyList) {
			System.out.println(m);
		}
	}
}
