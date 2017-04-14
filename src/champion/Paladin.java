package champion;

public class Paladin extends Champion{
public Paladin(String name){
		
		initialize(name);
	}
	public void initialize(String name){
		
		this.name = name;
		this.maxHp = 564.48;
		this.setHp(564.48);
		this.mana = 310.44;
		this.maxMana = 310.44;
		this.ad = 55.88;
		this.ap = 0;
		this.setArmor(31.384);
		this.mr = 32.1;
		this.flee = 0;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(0);
		this.setLevel(1);		
		
		//*********stat growth
		 this.hp_g = 86;
		 this.mana_g = 33;
		 this.ad_g = 3.5;
		 this.ap_g = 0;
		 this.armor_g = 4.3;
		 this.mr_g = 1.25;
	}
}
