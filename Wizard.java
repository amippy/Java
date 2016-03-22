public class Wizard{
	String name;
	int hp;

	void heal(Hero h){
		h.hp +=10;
		System.out.println(h.name + "は、" + this.name + "の魔法の力によって、10回復した!!"); 
	}
}
