package stage;

import champion.Champion;
import monsters.*;

public class PupaArea extends Stage{
	
	int slime;    // 6%
	int poly;     // 6%
	int pupa;     // 50%
	int fabre;    // 30%
	int BuggyFly; // 8%
	int x;
	int y;
	
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
        int monsOrItems = ram.nextInt(101);
        if(monsOrItems < 86){
        	adventure_mosnters(c); 
        }else
        	adventure_items();
        	
    }
    
    
    public void adventure_mosnters(Champion c){
    	int value = ram.nextInt(101);
        if (value <= 5){ // slime
        	Monsters slime = new Slime();
        	//System.out.println("log: random number: " + value);
        	System.out.println("You encounter with a Slime");
        	System.out.println("1. attack 2. item 3.escape");
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, slime);
        }
        if  (value >= 6 && value <= 11){ // poly
        	//System.out.println("random number: " + value);
        	System.out.println("You encounter with a Poly");
        	System.out.println("1. attack 2. item 3.escape");
        	Monsters poly = new Poly();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, poly);
        }
        if  (value >= 12 && value <= 62){ // pupa
        	//System.out.println("random number: " + value);
        	System.out.println("You encounter with a Pupa");
        	System.out.println("1. attack 2. item 3.escape");
        	Monsters pupa= new Pupa();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, pupa);
        }
        if  (value >= 63 && value <= 93){ // fabre
        	//System.out.println("random number: " + value);
        	System.out.println("You encounter with a Fabre");
        	System.out.println("1. attack 2. item 3.escape");
        	Monsters fabre = new Fabre();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, fabre);
        }
        if (value >= 94 && value <= 100){ //BuggyFly
        	//System.out.println("random number: " + value);
        	System.out.println("You encounter with....");
        	System.out.println( " a BuggyFly !!!!");
        	System.out.println("1. attack 2. item 3.escape");
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
