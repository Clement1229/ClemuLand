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
      
        new ChampionBuilder(champ_select, champ_name);
        
    	
    }
}
