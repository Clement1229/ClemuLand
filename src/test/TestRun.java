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
        if(champ_select == 1){
             c = new SwordMan("Clemu");
        }
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
    	/*System.out.println();
    	System.out.println("Select a move:");
    	System.out.println("1. adventure" + "       " + "2. Item");
    	System.out.println("3. exit");*/
    	/*int move = scan.nextInt();
    	switch(move){
    	case 1: 
    		stage.adventure(c);
    		break;
    	case 2:
    		
    	}*/
    }
}
