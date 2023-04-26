package question30;

class Person{
	// インスタンスフィールドを定義-----------------------------------------------
	String name;
	int age;
	double height;
	double weight;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット---------------------------
	public Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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

// Mainメソッド------------------------------------------------------
class Main {
	  public static void main(String[] args) {
	    Person person1 = new Person("鈴木太郎", 20, 1.7,60);
	    
	    // 出力-----------------------------------------
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    person1.print();
	    System.out.println("合計1人です");
	  }
}