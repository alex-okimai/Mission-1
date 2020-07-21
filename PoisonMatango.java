package j11;

public class PoisonMatango extends Matango{

	private int dokukaisu = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if(this.dokukaisu > 0) {
			System.out.println("さらに毒の胞子をばらました。");
			int dmg = h.getHp()/5;
			h.setHp(h.getHp() - dmg);
			System.out.println("ポイントのダメージを与えた。");
			this.dokukaisu--;
		}
	}
}
