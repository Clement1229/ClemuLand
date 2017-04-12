package champion;
import monsters.Monsters;
public class Champion {

	String name;
	private double hp;
	double mana;
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
	Boolean isdead = false;
	
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
		double md = 1.1; //exp modifier
		//int init = 500 ; //initial exp
		if(exp >= 132995) return;
		switch(level){
		    case 1:  if(exp >= init)  {setLevel(2); init += init*md; System.out.println("You're now lv2");};  //500
		    case 2:  if(exp >= init)  {setLevel(3); init += init*md; System.out.println("You're now lv3");};
		    case 3:  if(exp >= init)  {setLevel(4); init += init*md; System.out.println("You're now lv4");};
		    case 4:  if(exp >= init)  {setLevel(5); init += init*md; System.out.println("You're now lv5");};
		    case 5:  if(exp >= init)  {setLevel(6); init += init*md; System.out.println("You're now lv6");};
		    case 6:  if(exp >= init)  {setLevel(7); init += init*md; System.out.println("You're now lv7");};
		    case 7:  if(exp >= init)  {setLevel(8); init += init*md; System.out.println("You're now lv8");};
		    case 8:  if(exp >= init)  {setLevel(9); init += init*md; System.out.println("You're now lv9");};
		    case 9:  if(exp >= init)  {setLevel(10); init += init*md;System.out.println("You're now lv10");};
		    case 10: return;
		}
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
