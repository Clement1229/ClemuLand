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
		this.setLevel(1);		
	}
}
