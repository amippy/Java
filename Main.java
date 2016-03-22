public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		h.name = "Yoshio";
		h.hp = 100;

		System.out.println("勇者" + h.name + "を生み出した！");
		System.out.println(h.name + "の体力は" + h.hp + "だ！");

		Matango m1 = new Matango();
		m1.hp = 10;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 5;
		m2.suffix = 'B';

		h.attack();
		m1.run();
		h.attack();
		m2.run();







	}
}
