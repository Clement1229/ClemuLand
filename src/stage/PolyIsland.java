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
	
	public PolyIsland(){
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
    
    public void adventure(Champion c){
        Random ram = new Random();
        int value = ram.nextInt(101);
        if (value < 80){ // slime
        	Monsters poly = new Poly();
        	System.out.println("random number: " + value);
        	System.out.println("You encounter with a slime");
        	System.out.println("1. attack 2. item 3.escape");
        	
        	int battle= scan.nextInt();
        	switch(battle){
        	case 1: c.attack(poly);
        	break;
        	case 2:  break;
        	case 3:  break;
        	}
        }
        if  (value >= 90 && value < 100){ // poly
        	System.out.println("random number: " + value);
        	System.out.println("You encounter with a slime");
        	Monsters poly = new Poly();
        }
        if (value == 100){ //BuggyFly
        	System.out.println("random number: " + value);
        	System.out.println("You encounter with a slime");
        	Monsters Bug = new BuggyFly();
        }
    }

}
