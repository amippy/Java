public class Hero{
	String name ;
	int hp;

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + sec +"秒座った！");
	}

	void slip(){
		this.hp -= 5;
		System.out.println(this.name +"は、転んだ！");
	}

	void run(){
		System.out.println(this.name + "は、逃げた");
		System.out.println("GAMEOVER");
		System.out.println(this.name +  "の、体力は" + this.hp+ "でした!");
	}
	
}
