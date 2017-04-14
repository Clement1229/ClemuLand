package stage;

import logger.Logger;

import champion.Champion;
import monsters.*;

public class PupaArea extends Stage{
	
	int slime;    // 6%
	int poly;     // 6%
	int pupa;     // 50%
	int fabre;    // 30%
	int BuggyFly; // 8%
	
	
	public PupaArea(Champion c){
		super(c);
		monsterGenerator();
	}
	
    public void monsterGenerator(){
		slime = 5;  // 0-5
		poly = 11;  // 6-11
		pupa = 51;  // 12-62
		fabre = 81; // 63-93
		BuggyFly = 100; //94-100
	}
//****************************adventure*******************************
    public void adventure(Champion c){ // mons 86%  item 14%
        int monsOrItems = ran.nextInt(101);
        if(monsOrItems < 86){
        	adventure_mosnters(c); 
        }else
        	adventure_items();
        	
    }
    
    
    public void adventure_mosnters(Champion c){
    	int value = ran.nextInt(101);
        if (value <= 5){ // slime
        	Monsters slime = new Slime();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, slime);
        }
        if  (value >= 6 && value <= 11){ // poly
        	Monsters poly = new Poly();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, poly);
        }
        if  (value >= 12 && value <= 62){ // pupa
        	Monsters pupa= new Pupa();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, pupa);
        }
        if  (value >= 63 && value <= 93){ // fabre
        	Monsters fabre = new Fabre();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, fabre);
        }
        if (value >= 94 && value <= 100){ //BuggyFly
        	Monsters bug = new BuggyFly();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, bug);
        }
        if(c.getHp() <= 0){ // champion died
        	System.out.println("Game over");
        }else{              // continue playing
        	initialize();
        }
    }
}
