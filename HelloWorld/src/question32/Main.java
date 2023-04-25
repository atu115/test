package question32;

// Personクラス---------------------------------------
class Person{
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
		System.out.println("年は" + this.age + "です");
	}
}

// Mainクラス------------------------------------------------------------
public class Main{
	public static void main(String[] argos){
		// Person 鈴木--------------------------------------------------
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
		// Person 山田--------------------------------------------------
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
		System.out.println("合計" + Person.count + "人です");
		person1.printCount();
	}
}

