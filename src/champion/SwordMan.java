package champion;

public class SwordMan extends Champion {

/*	double hp;
	double mana;
	double ad; // basic damage
	double ap; // ability damage
	double armor; // physic
	double mr;  // magic resist
	double flee; // chance of dodge
	double crit; // critical strike
	double armorPen;
	double magicPen;
	double exp; // experience
	*/
	
	public SwordMan(String name){
		//500, 200, 60, 0, 35, 25, 0
		/*this.name = name;
		this.setHp(500);
		this.mana = 200;
		this.ad = 60;
		this.ap = 0;
		this.setArmor(35);
		this.mr = 15;
		this.flee = 0;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(0);
		this.setLevel(1);*/
		initialize(name);
	}
	public void initialize(String name){
		//500, 200, 60, 0, 35, 25, 0
		this.name = name;
		this.maxHp = Math.ceil(616.28);
		this.setHp(Math.ceil(616.28));
		this.mana = 0;
		this.maxMana = 0;
		this.ad = Math.ceil(57.88);
		this.ap = 0;
		this.setArmor(Math.ceil(27.536));
		this.mr = Math.ceil(32.1);
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
