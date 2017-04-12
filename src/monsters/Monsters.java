package monsters;

import champion.Champion;

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
	
	public Monsters(){
		
	}
	public Monsters(String name){
		setName(name);
	}
	public void attack(Champion c){
		c.setHp(c.getHp() - (this.ad - c.getArmor()));
		System.out.println(this.name + " has dealt: " + ((this.ad - c.getArmor())) +" to you." );
		
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
}
