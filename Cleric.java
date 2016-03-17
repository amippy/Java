public class Cleric{
	String name;
	int hp = 100;
	final int MAX_HP = 50;
	int mp= 10;
	final int MAX_MP = 10;i

	public void selfAid(){
		System.out.println("魔法セルフエイドを使う！");

		this.hp = this.MAX_HP;
		this.mp -= 5;
	}

	pray(int sec){
		System.out.pritnl(this.name + sec + "秒祈った");

		int r = new Random().nextInt(3);

		int rActual = Math.min(this.MAX_MP - this.mp,r);

		this.mp += rActual;
		System.out.println("MPが" + rActual + "回復した！");
		return rActual;
	

	}

}
