public class Cleric{
	String name;
        int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final String MIN_HP = 10;

	public void selfAid(){
		System.out.println(this.name + "は、魔法セルフエイドを手に入れた");
		this.hp = this.MAX_HP;
		System.out.println(this.name + "は、セルフエイドを使った")
		mp -= 5;
		System.out.println(this.name + "は、HPを最大まで回復した");
	}

	public int pray(int sec){
		System.out.println(this.name + "は" + sec + "秒天に祈った");

		int recover = new Random().nextInt(3) + sec;

		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;

	}

	}





}
