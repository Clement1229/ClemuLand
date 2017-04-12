package monsters;

public class Slime extends Monsters {
	
	
	public Slime(){
		//500, 200, 60, 0, 35, 25, 0
		this.setName("Slime");
		this.setHp(75);
		this.mana = 0;
		this.ad = 60;
		this.ap = 0;
		this.setArmor(5);
		this.mr = 0;
		this.flee = 0;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(40);
	}
	public Slime(String name){
		setName(name);
		this.setHp(65);
		this.mana = 0;
		this.ad = 60;
		this.ap = 0;
		this.setArmor(0);
		this.mr = 0;
		this.flee = 0;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(40);
	}
}
