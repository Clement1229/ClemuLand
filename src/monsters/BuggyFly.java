package monsters;

public class BuggyFly extends Monsters{
   
     public BuggyFly(){
    	this.setName("BuggyFly");
    	this.setHp(250);
 		this.mana = 10;
 		this.ad = 80;
 		this.ap = 0;
 		this.setArmor(0);
 		this.mr = 0;
 		this.flee = 0;
 		this.crit = 0;
 		this.armorPen = 10;
 		this.magicPen = 10;
 		this.setExp(40);
     }
     public BuggyFly(String name){
    	this.setName("BuggyFly");
     	this.setHp(250);
  		this.mana = 10;
  		this.ad = 80;
  		this.ap = 0;
  		this.setArmor(0);
  		this.mr = 0;
  		this.flee = 0;
  		this.crit = 0;
  		this.armorPen = 10;
  		this.magicPen = 10;
  		this.setExp(40);
     }
}
