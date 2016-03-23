public class Wand{
i	private String name;

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	private double power;

	public double getPower(){
		return this.name;
	}

	public void setPower(double power){
		if(power <= 0.5 && power >= 100.0){
			throw new IllegalArgumentException("エラー");
		}

		this.power = power;
	}
}
