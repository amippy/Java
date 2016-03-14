public class Hero{
	String name;
	private int hp;
	Sword sword;
	static int money;

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}

	private void die(){
		System.out.println(this.name + "は、死んでしまった！");
		System.out.println("GAME OVER です");
	}
	public void attack(Matango m){
		System.out.println(this.name + "は、攻撃を受けた");
		hp -= 2;
	}


}
