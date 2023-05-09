package question32;

//Personクラス---------------------------------------
public class Person{
	// フィールド-----------------------------
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット---------------------------
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// クラスフィールドcount
		this.count++;
	}
	
	// printCountメソッド----------------------------------------
	public void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	
	
	// bmiメソッド--------------------------------------------
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	// printメソッド--------------------------------------------
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "歳です");
	}
}
