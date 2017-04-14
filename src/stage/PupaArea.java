package stage;

import champion.Champion;
import monsters.BuggyFly;
import monsters.Monsters;
import monsters.Poly;
import monsters.Slime;

public class PupaArea extends Stage{
	int pupa;
	int slime;
	int poly;
	int BuggyFly;
	int x;
	int y;
	
	public PupaArea(Champion c){
		super(c);
		monsterGenerator();
	}
	
    public void monsterGenerator(){
		slime = 89; // 0~89
		poly = 90;  // 90~99
		BuggyFly = 100; //10011
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
        if (value < 90){ // slime
        	Monsters slime = new Slime();
        	System.out.println("log: random number: " + value);
        	System.out.println("You encounter with a Slime");
        	System.out.println("1. attack 2. item 3.escape");
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, slime);
        }
        if  (value >= 90 && value < 100){ // poly
        	System.out.println("random number: " + value);
        	System.out.println("You encounter with a Poly");
        	System.out.println("1. attack 2. item 3.escape");
        	Monsters poly = new Poly();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, poly);
        }
        if (value == 100){ //BuggyFly
        	System.out.println("random number: " + value);
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