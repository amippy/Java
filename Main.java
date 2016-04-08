public class Main{
	public static void main(String[] args){

		Hero h1 = new Hero();
		h1.name = "ジェシー";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "ジョージ";
		h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "あみ";
		w.hp = 100;
		w.heal(h1);
		w.heal(h2);

	}
}
