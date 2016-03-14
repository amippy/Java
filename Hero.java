public class Hero{
	private String name = "よしお";
	private int hp = 100;

	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}

	public void run(){
		System.out.println(this.name + "は、逃げ出した!");
	}

	public final void slip(){
		this.hp -= 5;
		System.out.println(this.getName() + "は転んだ！");
		System.out.println("５のダメージ");
	}

	
}
