public abstract Character{

	String name;
	int hp;
	public abstract void attck(Matango m);

	public void run(){
		System.out.println(this.name + "は、逃げ出した！");
	}
}
