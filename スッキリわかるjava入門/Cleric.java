package j8;

import java.util.Random;

public class Cleric {
	public String name;
	public int hp;
	public final int maxHp = 50;
	public int mp;
	public final int maxMp = 10;
	
	public void selfAid() {
		this.hp = this.maxHp;
		this.mp -= 5;
	}
	
	public int pray(int jikan) {
		System.out.println(jikan + "秒の時間をかかった。");
		int kaifukujikan = new Random().nextInt(3) + jikan;	
		int kaifusu = Math.min(this.maxMp - this.mp,kaifukujikan);
		this.mp += kaifusu; 
		System.out.println(this.mp + "点回復した。");
		return kaifukujikan;
	}
	
	public static void main(String[] args) {
		Cleric a = new Cleric();
		a.name = "wjm";
		a.hp = 40;
		a.mp = 0;
		a.pray(2);
	}
}
