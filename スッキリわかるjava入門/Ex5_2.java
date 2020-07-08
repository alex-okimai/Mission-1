package j5;

public class Ex5_2 {
	
	public static void main(String[] args){
		String title = "wjm";
		String address = "1130@qq.com";
		String text = "XXXXX";
		email(title,address,text);
	}
	
	public static void email(String title,String address,String text){
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println(title + "メールのタイトル");
		System.out.println(text + "メールの本文");
	}
}
