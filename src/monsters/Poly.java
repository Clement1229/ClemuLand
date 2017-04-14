package monsters;

public class Poly extends Monsters{
	public Poly(){
		//50, 0, 60, 0, 0, 0, 0,0 ,0
		this.setName("Poly");
		this.setHp(50);
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
	public Poly(String name){
		setName(name);
		this.setHp(50);
		this.mana = 0;
		this.ad = 40;
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
