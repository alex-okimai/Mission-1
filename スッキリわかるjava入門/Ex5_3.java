package j5;

public class Ex5_3 {
	
	public static void main(String[] args) {
		String address = "wjm";
		String text = "XXXXX";
		email(address,text);
	}
	
	public static void email(String address,String title,String text){
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println(title != null ?"件名："+ title : "件名：無題" );
		System.out.println("メールの本文" + text);
	}
	
	public static void email(String address,String text){
		email(address,null,text);
	}
}
