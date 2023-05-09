package question31;

//　Personクラス----------------------
class Person{
	// インスタンスフィールドを定義-----------------------------------------------
	String name;
	int age;
	double height;
	int weight;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット---------------------------
	public Person(String name,int age,double height,int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// インスタンスメソッドbuyを定義---------------------
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// インスタンスメソッドbuyを定義----------------------
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
	// bmiメソッド-----------------------------------------------
	public double bmi() {
	    // BMI = 体重(Kg) × (身長(m))2------------------
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}
	
	// printメソッド---------------------------------------------
	public void print() {
		double BMI = bmi();
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(BMI) + "です");
	}
}
