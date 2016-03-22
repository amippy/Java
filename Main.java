public class Main{
	public static void main(String[] args){

		Sword s = new Sword();
		s.name = "勇者の剣";
		s.damage = 10;

		Hero h = new Hero();
		h.name = "Yoshio";
		h.hp = 100;
		h.sword = s;

		System.out.println("勇者" + h.name + "を生み出した！");
		System.out.println(h.name + "の体力は" + h.hp + "だ！");

		
		System.out.println(h.name + "は、" + h.sword.name + "を取り出した！");

		h.attack();







	}
}
