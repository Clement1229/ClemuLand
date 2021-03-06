package stage;

import java.util.Random;
import java.util.Scanner;

import champion.Champion;
import monsters.BuggyFly;
import monsters.Monsters;
import monsters.Poly;
import monsters.Slime;

public class PolyIsland extends Stage {
	
	//declare monsters in this stage
		int slime;
		int poly;
		int BuggyFly;
		
	
	public PolyIsland(Champion c){
		super(c);
		monsterGenerator();
	}
	
    public void monsterGenerator(){
		poly = 89; // 0~89
		slime = 90;  // 90~99
		BuggyFly = 100; //100
	}
    
    public void battle(Champion c, Monsters m,int battle_n){
    	switch(battle_n){
    	case 1: c.attack(m);
    	break;
    	case 2:  break;
    	case 3:  break;
    	}
    }
    
    public void adventure(Champion c){ // mons 86%  item 14%
        int monsOrItems = ran.nextInt(101);
        if(monsOrItems < 86){
        	adventure_mosnters(c); 
        }else
        	adventure_items();
        	
    }
    public void adventure_mosnters(Champion c){
    	int value = ran.nextInt(101);
        if (value < 90){ // ply
        	Monsters poly = new Poly();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, poly);
        }
        if  (value >= 90 && value < 100){ // slime
        	Monsters slime = new Slime();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, slime);
        }
        if (value == 100){ //BuggyFly
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
