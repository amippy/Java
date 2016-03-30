public class Dancer extends Character{
	public void dance(){
		System.out.println(this.name + "は、情熱的に踊った！！");
	}

	public void attacl(Matango m){
		System.out.println(this.name + "の攻撃！");
		System.out.println("−３ポイント体力減少！");
		m.hp -= 3;
	}
}
