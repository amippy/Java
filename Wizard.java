public class Wizard extends Character{

	int mp;
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に３ポイントのダメージを与えた！");
		m.hp -= 3;
	}

	public void fireball(Matango m){
		System.out.println(this.name + "は、火の玉を放った！");
		System.out.println("敵に２０ポイントのダメージ！");
		m.hp -= 20;
		this.mp -= 5;
	}

}
