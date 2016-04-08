public class Main{
	public static void main(String[] args){

		Shield sh = new Shield();
		sh.name = "鉄の盾";
		sh.damage = 0;

		Hero h = new Hero();
		h.name = "ジェシー";
		h.hp = 100;
		h.shield = sh;
		System.out.println(h.name + "の、現在の武器は" + h.shield.name );
	}
}
