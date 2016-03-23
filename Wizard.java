public class Wizard{
	private int hp;

	public int getHp(){
		return this.hp;
	}
	public void set(int hp){
		if(hp < 0){
			hp = 0;
		}
		this.hp = hp;
	}


	private int mp;

	public int getMp(){
		return this.mp;
	}

	public void setMp(int mp){
		if(mp < 0){
			throw new IllegalArgumentException("エラー");
		}
		this.mp = mp;
	}


	private String name;



	public String getName(){
		return this.name;
	}

	public void setName(String name){
		if(name == null){

			throw new IllegalArgumentExeption("エラー");
		}
		if(name <= 3){
			throw new IllegalArgumentException("エラー");
		}
		this.name = name;
	}


	public void heal(Hero h){
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().power());

		h.setHP(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}



}

