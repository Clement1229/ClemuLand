package monsters;

public class Fabre extends Monsters{
	public Fabre(){
		
		this.setName("Fabre");	
		this.setHp(63);
		this.mana = 0;
		this.ad = 50;
		this.ap = 0;
		this.setArmor(38);
		this.mr = 25;
		this.flee = 5;
		this.crit = 0;
		this.armorPen = 0;
		this.magicPen = 0;
		this.setExp(48);
		log.meetMonsters(this);
    	log.inBattleMessage();
	}
}
