public class Main{
	public static void main(String[] args){

		Hero h1 = new Hero();
		h1.name = "よしお";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "あきお";
		h2.hp = 100;

		Wizard w = new Wizard();
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

	}
}


