public class Dancer{

	public void dance(){
		System.out.println(this.name + "は、情熱的に踊った！");

	}

	public void attack(Matango m){
		System.out.println(this.name + "は、攻撃した!");
		SYstem.out.println("敵は体力を-3減った！");
		m.hp -= 3;
	}
}
