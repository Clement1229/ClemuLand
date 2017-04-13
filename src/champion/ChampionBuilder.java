package champion;

import java.util.Scanner;

import stage.SlimeForest;
import stage.Stage;

public class ChampionBuilder {
	Scanner scan = new Scanner(System.in);
	Champion c;
	
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
    	System.out.println("1. SlimeForest       2.PolyIsland");
    	int stage_num = scan.nextInt();
    	String stage_name;
    	//Stage stage = new Stage(c);
    	
    	switch(stage_num){
    	case 1:  stage_name = "SlimeForest";
    			 System.out.println("You've entered "+ stage_name );
    			 Stage stage = new SlimeForest(c);
    			 break;
    	case 2: System.out.println("boom");
    	break;
    	case 3: System.out.println("testing");
    	break;
    	}
	}
}
