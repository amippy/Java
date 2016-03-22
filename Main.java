public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		h.name = "Yoshio";
		h.hp = 100;

		System.out.println("勇者" + h.name + "を生み出した！");
		System.out.println(h.name + "の体力は" + h.hp + "だ！");

		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();




	}
}
