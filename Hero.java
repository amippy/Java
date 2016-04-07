public class Hero{
	String name;
	int hp;

	void attack(){
		System.out.println(this.name+"は攻撃をした");
	}

	void run(){
		System.out.println(this.name+"勇者は逃げだした！");
		System.out.println("GAMEOVER");
	}

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println(sec + "秒眠ったので"+ sec + "回復した!");
	}
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んで体力５減った！");
	}
}
