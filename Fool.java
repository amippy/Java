public class Fool extends Character implements Human{

	public void attack(Matango m){
		System.out.println(this.getName() + "は、戦わずに遊んでいる！");
	}

	public void talk();
	public void watch();
	public void hear();
	public void run();
}
