public class Wand{
	private String name;

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		if(name == null || name.length() < 3){
			throw new IllegalArgumentException
			("杖に設定されている名前が異常です");
		}
		this.name = name;
	}

	private double power;

	public double getPower(){
		return this.name;
	}

	public void setPower(double power){
		if(power < 0.5 || power > 100.0){
			throw new IllegalArgumentException("杖に設定されている魔力が異常");
		}

		this.power = power;
	}
}
