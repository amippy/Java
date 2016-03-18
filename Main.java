public class Main{
	public static void main(String[] args){

		Hero h = new Hero();
		h.name = "よしお";
		h.hp = 100;

		GirlFriend g = new GirlFriend();
		g.name = "マリー";
		g.hp = 20;

		System.out.println(h.name + "と" + g.name + "は、結婚した！");

	}
}
