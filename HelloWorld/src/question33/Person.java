package question33;

//Personクラス---------------------------------------
public class Person{
	// フィールド-----------------------------
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット---------------------------
	Person( String firstName , String lastName , int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// クラスフィールドcount
		this.count++;
	}
	
	public String fullName(){
		return this.firstName + this.lastName;
		}
	
	public void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	
	
	// bmiメソッド--------------------------------------------
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	// printメソッド--------------------------------------------
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "歳です");
	}
}

