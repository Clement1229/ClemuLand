package champion;

import java.util.Scanner;

import stage.*;

public class ChampionBuilder {
	Scanner scan = new Scanner(System.in);
	Champion c;
	Stage stage;
	
	public ChampionBuilder(){
		System.out.println("Create your Champion");
        System.out.println("1. SwordMan     2.Thief    3.Paladin");
        int champ_select = scan.nextInt();
        System.out.println("Enter your name: ");
        String champ_name = scan.next();
		if (champ_select == 1){
			c = new SwordMan(champ_name);
			System.out.println("You have selected SwordMan!");
		}
		if ( champ_select == 2){
		    c = new Thief(champ_name);
		    System.out.println("You have selected Thief!");
		}
		if ( champ_select == 3){
		    c = new Paladin(champ_name);
		    System.out.println("You have selected Paladin!");
		}
		chooseStage();
	}
	
	public void chooseStage(){
		System.out.println("Enter a number to select a stage");
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
