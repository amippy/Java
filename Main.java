public class Main{
	public static void main(String[] args){

		Wizard w = new Wizard();
		w.name = "Ami";
		w.hp = 1000;

		Hero h1 = new Hero();
		h1.name = "Yke";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "amigo";
		h2.hp = 200;

		Hero h3 = new Hero();
		h3.name = "foo";
		h3.hp = 300;

		w.heal(h1);
		w.heal(h2);
		w.heal(h3);
		








	}
}
