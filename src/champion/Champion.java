package champion;
import monsters.Monsters;
public class Champion {

	String name;
	private double hp;
	double maxHp;
	double mana;
	double maxMana;
	double speed;
	double ad; // basic damage
	double ap; // ability damage
	private double armor; // physic
	double mr;  // magic resist
	double flee; // chance of dodge
	double crit; // critical strike
	double armorPen;
	double magicPen;
	private double exp; // experience
	private int level;
	int init = 80 ; //initial level 1 required exp
	double md = 1.1 ; // exp required modifier
	Boolean isdead = false;

	//attack formula
	private double ad_m = 1.1; // ad_modifier -> when (attack - armor / attack) > 80%
	double threshold_h = 0.8; // default 0.8
	double threshold_l = 0.5;	
	
	//********** level up stat growth 
	double hp_g;
	double mana_g;
	double ad_g;
	double ap_g;
	double armor_g;
	double mr_g;
	
	
	public Champion(){
		
	}
	
	public void initialize(){
		
	}
	
	public void getStatus(){
		System.out.println("*********" + name +"***** LV: " + level +" *********");
		System.out.println("hp: " + Math.ceil(hp) +"    " + "mana: " + Math.ceil(mana));
		System.out.println("ad: " + Math.ceil(ad) + "     " + "ap: " + Math.ceil(ap) );
		System.out.println("armor: " + Math.ceil(armor) + "  " + "mr: " + Math.ceil(mr));
		System.out.println("flee: " + Math.ceil(flee) + "    " + "crit: " + Math.ceil(crit) );
		System.out.println("adPen: " + Math.ceil(armorPen) + "   " + "apPen: " + Math.ceil(magicPen));
		System.out.println("exp: " + Math.ceil(exp) + "    " + "speed: "  + speed);
		System.out.println("**********************************");		
		
	}
	
	
	public void attack(Monsters m){
		if(this.speed >= m.getSpeed()){
			m.setHp(m.getHp() - damageCalculator(m));
			System.out.println("You dealt " + Math.ceil(damageCalculator(m)) + " damage.");
			if(m.getHp() <= 0){ // if you killed monsters
				m_isDead(m);
				return; // end this action so monster won't attack back
			}
			m.attack(this);
			if(this.hp <= 0){ // check if you are dead
				c_isDead();
			}
		}else{
			m.attack(this);  // monster attacks champ
			if(this.hp <= 0){ // check if you are dead
				c_isDead();
			}
			m.setHp(m.getHp() - (damageCalculator(m)));  // Champ attacks monster
			System.out.println("You dealt " + Math.ceil(damageCalculator(m)) + " damage.");
			if(m.getHp() <= 0){ // if you killed monsters
				m_isDead(m);
			}
		}
	}
	// higher ratio ad/armor -> the higher damage...  vice versa
	public double damageCalculator(Monsters m){  // calculate and return damage
		double damage = 0;
		if(this.ad < m.getArmor()){
			damage= 1;
		}
		
		if (((this.ad - m.getArmor())/this.ad) >= threshold_h){   // (attack - armor) / attack > 80%
			damage = (this.ad * this.getAd_m() - m.getArmor()); 
		}
		if (((this.ad - m.getArmor())/this.ad) > threshold_l     // >=50% ~ <80%
		    && ((this.ad - m.getArmor())/this.ad) <= threshold_h){
			damage = (this.ad - m.getArmor());
		}
		if (((this.ad - m.getArmor())/this.ad) <= threshold_l){  // < 50%{
			damage = (this.ad - m.getArmor()* m.getAd_m());
		}
		return damage;
	}
	public void m_isDead(Monsters m){
		System.out.println("You've killed " + m.getName() + ".");
		this.setExp(this.getExp() + m.getExp());
		System.out.println("gained " + m.getExp() + " exp.");
		islevelup(getLevel(), getExp());
		this.getStatus();
	}
	public void c_isDead(){
		System.out.println("You're dead.");
		isdead = true;
	}
	
	public void islevelup(int level, double exp){
		//double md = 1.1; //exp modifier
		//int init = 500 ; //initial exp
		if(exp >= 132995) return; // reach highest lv
		if(exp >= init){
			levelUp(level);
		}
	
	}
	public void levelUp(int o){  // o = original level
		
		setLevel(o+1);
		init += init*md; 
		System.out.println(" congrats!! You're now lv" + (o+1) + "+++++++++");
		this.ad += ad_g;
		this.ap += ap_g;
		this.hp += hp_g;
		this.mana += mana_g;      // current hp & mana slightly added when level up
		this.maxHp += hp_g;
		this.maxMana += mana_g;            
		this.armor += armor_g;
		this.mr += mr_g;
		
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public double getAd_m() {
		return ad_m;
	}

	public void setAd_m(double ad_m) {
		this.ad_m = ad_m;
	}
}
