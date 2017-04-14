package champion;

public class SwordMan extends Champion {

	
	public SwordMan(String name){
		
		initialize(name);
	}
	public void initialize(String name){
		
		this.name = name;
		this.maxHp = 616.28;
		this.setHp(616.28);
		this.mana = 0;
		this.maxMana = 0;
		this.ad =57.88;
		this.ap = 0;
		this.setArmor(27.536);
		this.mr = 32.1;
		this.flee = 0;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(0);
		this.setLevel(1);		
		
		//*********stat growth
		 this.hp_g = 84.25;
		 this.mana_g = 0;
		 this.ad_g = 4.5;
		 this.ap_g = 0;
		 this.armor_g = 3;
		 this.mr_g = 1.25;
	}
}
