package stage;

import java.util.Random;
import java.util.Scanner;

import champion.Champion;
import monsters.Monsters;

public class Stage {
    
	Champion c;
	Random ram = new Random();
	Scanner scan = new Scanner(System.in);
	int x;
	int y;
	
	public Stage(){
		
	}
	
	public Stage(Champion c){
		this.c = c;
		//System.out.println( "statge constructor");
		initialize();
    		 
    }
	public void initialize(){
		System.out.println("Select a move:");
    	System.out.println("1. adventure" + "       " + "2. Item");
    	System.out.println("3. Status" + "          " + "4. exit");
    	int move = scan.nextInt();
    	switch(move){
    	case 1: 
    		adventure(c);
    		break;
    	case 2:
    		break;
    	case 3:
    		c.getStatus();
    		initialize();
    		break;
    	}
	}
	
	
	public void monsterGenerator(){
		
	}
	
 
	
	
	public void doAttack(Champion c, Monsters m){  //when chosing attack
		c.attack(m);
		if(m.getHp() <= 0){
			return;
		}
		System.out.println();
		System.out.println("1. attack 2. item 3.escape");
		int input = scan.nextInt();
		battleCondition(input,c,m);
	}
    
    public void battleCondition(int battle_n, Champion c, Monsters m){
    	switch(battle_n){
    	case 1: doAttack(c,m);
    	break;
    	case 2:  break;
    	case 3:  break;
    	}
    }
    
   
    
	public void adventure(Champion c){
		
	}
	
	public void adventure_items(){
    	System.out.println("You found an item!!! which is nothing......");
    	initialize();
    }
	
}
