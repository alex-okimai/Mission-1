package j5;

public class Ex5_3 {
	
	public static void main(String[] args) {
		String address = "wjm";
		String text = "XXXXX";
		email(address,text);
	}
	
	public static void email(String title,String address,String text){
		System.out.println(title + "に、以下のメールを送信しました。");
		System.out.println(address + "メールのタイトル");
		System.out.println(text + "メールの本文");
	}
	
	public static void email(String address,String text){
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("メールの本文" + text);
	}
}
