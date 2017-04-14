package monsters;

import champion.Champion;
import logger.Logger;

public class Monsters {
	private String name;
	private double speed;
	private double hp;
	double mana;
	double ad; // basic damage
	double ap; // ability damage
	private double armor; // physic
	double mr;  // magic resist
	double flee; // chance of dodge
	double crit; // critical strike
	double armorPen;
	double magicPen;
	private double exp;
	boolean isdead = false;
	Logger log = new Logger();
	
	//attack formula
	private double ad_m = 1.1; // attack modifier default 1.1
	double threshold_h = 0.8; // default 0.8
	double threshold_l = 0.5;
	
	
	public Monsters(){
		
	}
	public Monsters(String name){
		setName(name);
	}
	public void attack(Champion c){
		c.setHp(c.getHp() - damageCalculator(c));
		System.out.println(this.name + " has dealt: " + ((this.ad - c.getArmor())) +" to you." );
		
	}
	public double damageCalculator(Champion c){  // calculate and return damage
		double damage = 0;
		if(this.ad < c.getArmor()){
			damage= 1;
		}
		
		if (((this.ad - c.getArmor())/this.ad) >= threshold_h){   // (attack - armor) / attack > 80%
			damage = (this.ad * this.ad_m - c.getArmor()); 
		}
		if (((this.ad - c.getArmor())/this.ad) > threshold_l     // >=50% ~ <80%
		    && ((this.ad - c.getArmor())/this.ad) <= threshold_h){
			damage = (this.ad - c.getArmor());
		}
		if (((this.ad - c.getArmor())/this.ad) <= threshold_l){  // < 50%{
			damage = (this.ad - c.getArmor()* c.getAd_m());
		}
		return damage;
	}
	
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getArmor() {
		return armor;
	}
	public void setArmor(double armor) {
		this.armor = armor;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getAd_m() {
		return ad_m;
	}
	public void setAd_m(double ad_m) {
		this.ad_m = ad_m;
	}
}
