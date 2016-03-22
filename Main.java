public class Main{
	public static void main(String[] args){

		Hero h1 = new Hero("Yoshio");

		System.out.println(h1.hp);
		System.out.println(h1.name);

		System.out.println("ようこそ！" + h1.name + "さん！");

		Hero h2 = new Hero();

		System.out.println(h2.hp);
		System.out.println(h2.name);

		System.out.println("名前を入力してください！");


	}
}
