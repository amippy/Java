public class Hero{
	String name;
	int hp;
	static int money;

	Hero(String name){
		this.hp = 100;
		this.name = name;
	}

	Hero(){
		this("ダミー");
	}

}

