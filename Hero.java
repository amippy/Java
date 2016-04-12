public class Hero{
	int hp;
	String name;
	static int money;


	Hero(String name){
		this.hp = 100;
		this.name =  name;
	}

	Hero(){
		this("NO NAME");
	}

}

