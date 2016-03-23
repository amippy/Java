public class Hero{

	private String name;
	
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	private int hp;

	Hero(){
		this.hp =100;
	}

	public void attack(Matango m){
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("５ポイントのダメージを与えた!");
	}

	public void run(){
		System.out.println(this.name + "は、逃げ出した！");
	}


}
