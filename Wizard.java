public class Wizard{
	private int hp;

	public int getHp(){
		return this.hp;
	}
	public void set(int hp){
		if(hp < 0){
			this.hp = 0;
		}else{
			this.hp = hp;
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
		if(name == null || name.length() < 3){
			throw new IllegalArgumentException
			("魔法使いの名前の長さが異常");
		}
		this.name = name;
	}

	public Wand getWand(){
		return this.wand;
	}

	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException
			("設定されようとしている杖がnullです。");
		}
		this.wand = wand;


	public void heal(Hero h){
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().power());

		h.setHP(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}



}

