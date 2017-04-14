package logger;
import java.util.Random;

import monsters.*;

public class Logger {
	
	Random ran = new Random();
	
	public Logger(){
		
	}

	public void inBattleMessage(){
		System.out.println("1. attack 2. item 3.escape");
	}
	
	public void meetMonsters(Monsters m){ // giving a variety of greeting messages
		int dice = ran.nextInt(3);
		switch(dice){
		case 0: meetMonsters0(m); break;
		case 1: meetMonsters1(m); break;
		case 2: meetMonsters2(m); break;
		}
	}
	
	public void actionInMap(){
		System.out.println("Select a move:");
    	System.out.println("1. adventure" + "       " + "2. Item"  +"            3. Status");
    	System.out.println("4. checkMap" +  "       5.Save & Exit");
	}
	
	public void meetMonsters0(Monsters m){
		System.out.println("You encounter with a " + m.getName());
	}

	public void meetMonsters1(Monsters m){
		System.out.println("Hmmmmmmmmm..... It's a " + m.getName());
	}
	public void meetMonsters2(Monsters m){
		System.out.println("meh... A " + m.getName());
	}
	public void meetLittleBoss(Monsters m){
		System.out.println("OH! wow! It's a" + m.getName() + " !!!");
	}
	public void meetBoss(Monsters m){
		System.out.println("OH! Wait a minute!");
		System.out.println("Here comes a" +  m.getName() + " !!!!!!!!!!!!!");
	}
	
	
}
