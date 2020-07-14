package j9;

public class Cleric {
	public String name;
	public int hp;
	static final int maxHp = 50;
	public int mp;
	static final int maxMp = 10;

	
	Cleric(String name,int hp,int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;			
	}
	
	Cleric(String name,int hp){
		this.name = name;
		this.hp = hp;
		this.mp = Cleric.maxMp;	
	}
	
	Cleric(String name){
		this.name = name;
		this.hp = Cleric.maxHp;
		this.mp = Cleric.maxMp;	
	}
	
	Cleric(){
	}
	
}
