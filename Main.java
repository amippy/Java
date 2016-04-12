public class Main{
	public static void main(String[] args){

		Hero h1 = new Hero("ジェシー");

		Hero h2 =  new Hero();

		Hero.money = 1000;

		System.out.println(h1.hp);
		System.out.println(Hero.money);

		h1.money = 600;

		System.out.println(h2.money);
	}
}
