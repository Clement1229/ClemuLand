package test;
import java.util.Scanner;

import champion.*;
import monsters.*;
import stage.*;

public class TestRun {
	
    public static void main(String [] args){
    	Scanner scan = new Scanner(System.in);
    	Champion c = new Champion();
    	
    	System.out.println("Welcome to ClemuLand!!");
        System.out.println("Create your Champion");
        System.out.println("1. SwordMan     2.Thief");
        int champ_select = scan.nextInt();
        System.out.println("Enter your name: ");
        String champ_name = scan.next();
        //ChampionBuilder cb = new ChampionBuilder(champ_select, champ_name);
       // Champion c = new Champion(ChampionBuilder(champ_select, champ_name));
        new ChampionBuilder(champ_select, champ_name);
        //if(champ_select == 1){
        //     c = new SwordMan(champ_name);
        //}
 //   	System.out.println("Enter a number to select a stage");
 //   	System.out.println("1. SlimeForest       2.PolyIsland");
 //  	int stage_num = scan.nextInt();
 //   	String stage_name;
    	//Stage stage = new Stage(c);
    	
 //   	switch(stage_num){
 //   	case 1:  stage_name = "SlimeForest";
 //   			 System.out.println("You've entered "+ stage_name );
 //   			 Stage stage = new SlimeForest(c);
 //   			 break;
 //   	case 2: System.out.println("boom");
  //  	break;
 //   	case 3: System.out.println("testing");
 //   	break;
  //  	}
    	
    }
}
