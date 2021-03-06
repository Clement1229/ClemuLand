package stage;
import java.util.Random;
import java.util.Scanner;

import champion.Champion;
import monsters.*;

public class SlimeForest extends Stage{
	
	//declare monsters in this stage
	int slime;
	int poly;
	int BuggyFly;
	int x;
	int y;
	
	public SlimeForest(Champion c){
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
        int monsOrItems = ran.nextInt(101);
        if(monsOrItems < 86){
        	adventure_mosnters(c); 
        }else
        	adventure_items();
        	
    }
    
    
    public void adventure_mosnters(Champion c){
    	int value = ran.nextInt(101);
        if (value < 90){ // slime
        	Monsters slime = new Slime();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, slime);
        }
        if  (value >= 90 && value < 100){ // poly
        	Monsters poly = new Poly();
        	int battle_n= scan.nextInt();
        	battleCondition(battle_n, c, poly);
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
