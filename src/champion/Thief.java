package champion;

public class Thief extends Champion{
	public Thief(String name){
		
		initialize(name);
	}
	public void initialize(String name){
		
		this.name = name;
		this.maxHp = 550;
		this.setHp(550);
		this.mana = 300;
		this.maxMana = 3000;
		this.ad = 60;
		this.ap = 0;
		this.setArmor(22);
		this.mr = 32.1;
		this.flee = 0;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(0);
		this.setLevel(1);		
		
		//*********stat growth
		 this.hp_g = 85;
		 this.mana_g = 0;
		 this.ad_g = 3.3;
		 this.ap_g = 0;
		 this.armor_g = 3.5;
		 this.mr_g = 1.25;
	}
}

