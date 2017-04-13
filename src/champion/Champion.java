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
		System.out.println("***********************");
		System.out.println("hp: " + hp +"    " + "mana: " + mana);
		System.out.println("ad: " + ad + "     " + "ap: " + ap );
		System.out.println("armor: " + armor + "  " + "mr: " + mr);
		System.out.println("flee: " + flee + "    " + "crit: " + crit );
		System.out.println("adPen: " + armorPen + "   " + "apPen: " + magicPen);
		System.out.println("exp: " + exp + "    " + "level: "  + level);
		System.out.println("speed: " + speed);
		System.out.println("***********************");		
		
	}
	
	
	public void attack(Monsters m){
		if(this.speed >= m.getSpeed()){
			m.setHp(m.getHp() - (this.ad - m.getArmor()));
			System.out.println("You dealt " + (this.ad - m.getArmor() + " damage."));
			m.attack(this);
		}else{
			m.attack(this);
			m.setHp(m.getHp() - (this.ad - m.getArmor()));
			System.out.println("You dealt " + (this.ad - m.getArmor() + " damage."));
		}
		
		
		if(m.getHp() <= 0){
			System.out.println("You've killed " + m.getName() + ".");
			this.setExp(this.getExp() + m.getExp());
			System.out.println("gained " + m.getExp() + " exp.");
			islevelup(getLevel(), getExp());
			this.getStatus();
		}
		if(this.hp <= 0){
			System.out.println("You're dead.");
			isdead = true;
		}
	}
	
	public void islevelup(int level, double exp){
		//double md = 1.1; //exp modifier
		//int init = 500 ; //initial exp
		if(exp >= 132995) return; // reach highest lv
		if(exp >= init){
			levelUp(level);
		}
		/*switch(level){
		    case 1:  if(exp >= init)  {levelUp(level);};  //500
		    case 2:  if(exp >= init)  {levelUp(level);};
		    case 3:  if(exp >= init)  {levelUp(level);};
		    case 4:  if(exp >= init)  {levelUp(level);};
		    case 5:  if(exp >= init)  {levelUp(level);};
		    case 6:  if(exp >= init)  {levelUp(level);};
		    case 7:  if(exp >= init)  {levelUp(level);};
		    case 8:  if(exp >= init)  {levelUp(level);};
		    case 9:  if(exp >= init)  {levelUp(level);};
		    case 10: return;
		}*/
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
}
