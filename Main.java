public class Main{
	public static void main(String[] args){
		Hero h = new Hero();

		h.name = "よしお";
		h.hp = 100;

		System.out.println("勇者" + h.name + "は" + h.hp + "体力をもつ！"); 

		h.run();

		Matango m = new Matango();

		m.hp = 100;

		m.run();

		m.suffix = 'A';



		
	}
}
