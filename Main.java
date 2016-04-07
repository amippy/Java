public class Main{
	public static void main(String[]args){
		Hero h = new Hero();
		h.name = "ジェシー";
		h.hp = 100;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		m1.run();
		h.run();

	}
}
