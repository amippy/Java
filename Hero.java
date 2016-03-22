public class Hero{

	String name;
	private int hp;
	static int money;

	Hero(){
		this("ダミー");
	}

	Hero(String name){
		this.hp = 100;
		this.name = name;
	}

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って体力回復した！");
	}

	private void die(){
		System.out.println(this.name + "は、死んだ！");
		System.out.println("GAMEOVER");
	}

	public void attack(Matango m){
		m.hp -= 5;
		System.out.println(m.name + "は、攻撃を受けた！");
	}
}
