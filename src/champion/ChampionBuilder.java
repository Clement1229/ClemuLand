package champion;

import java.util.Scanner;

import stage.*;

public class ChampionBuilder {
	Scanner scan = new Scanner(System.in);
	Champion c;
	Stage stage;
	
	public ChampionBuilder(int n, String champ_name){
		if (n == 1){
			c = new SwordMan(champ_name);
			System.out.println("You have selected SwordMan!");
		}
		if ( n == 2){
		    c = new Thief(champ_name);
		}
		chooseStage();
	}
	
	public void chooseStage(){
		System.out.println("Enter a number to select a statge");
    	System.out.println("1. SlimeForest       2.PolyIsland       3.PupaArea");
    	int stage_num = scan.nextInt();
    	String stage_name;
    	//Stage stage = new Stage(c);
    	
    	switch(stage_num){
    	case 1:  stage_name = "SlimeForest";
    			 System.out.println("You've entered "+ stage_name );
    			 stage = new SlimeForest(c);
    			 break;
    	case 2:  stage_name = "PolyIsland";
		 		 System.out.println("You've entered "+ stage_name );
		 		 stage = new PolyIsland(c);
		 		 break;
    	case 3: stage_name = "PupaArea";
		 		System.out.println("You've entered "+ stage_name );
		 		stage = new PupaArea(c);
		 		break;
    	
    	}
	}
}
