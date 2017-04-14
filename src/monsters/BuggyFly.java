package monsters;

public class BuggyFly extends Monsters{
   
     public BuggyFly(){
    	this.setName("BuggyFly");
    	this.setHp(250);
 		this.mana = 10;
 		this.ad = 80;
 		this.ap = 0;
 		this.setArmor(25);
 		this.mr = 0;
 		this.flee = 10;
 		this.crit = 15;
 		this.armorPen = 10;
 		this.magicPen = 10;
 		this.setExp(150);
		log.meetMonsters(this);
    	log.inBattleMessage();
     }

}
