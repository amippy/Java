public class Hero extends Characater{
	public void attack(Monsterc m){
		System.out.println(this.name + " の攻撃!!");
		System.out.println("敵に１９ポイントのダメージを与えろ！);

		m.hp -= 10;


	}
}

