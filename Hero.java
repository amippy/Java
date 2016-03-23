public class Hero{
	private String name;

	public void setName(String name){

		if(name == null){
			throw new IllegalArgumentException
			("名前がnullである。処理を中断。");
		}

		if(name.length() <= 1){
			throw new IllegalArgumentException
			("名前が短すぎる。処理を中断");
		}

		if(name.length() >= 20){
			throw new IllegalArgumentException
			("名前が長すぎる。処理を中断");
		}

		this.name = name;
	}
}


