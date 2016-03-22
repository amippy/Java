public class Hero{

	String name;
	int hp;
	Sword sword;


	void attack(){
		this.hp = 100;
		System.out.println(this.name + "は、" + this.sword.name + "を使って攻撃をした！");
	}

	void run(){
		this.hp =100;
		System.out.println(this.name + "は、逃げ出した！");
	}

	void sit(int sec){
		this.hp += sec;
		System.out.println(sec + "秒座った！" + this.name + "は、座った分回復した！"); 

		
	}

	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んで体力を５減らした");
	}

	void sleep(){
		this.hp =100;
		System.out.println(this.name + "は、寝て回復をした！");
	}
}
