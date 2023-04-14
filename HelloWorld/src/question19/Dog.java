package question19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	int num;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	Dog() {
	//コンストラクタ作成
		this.name = "犬";
		//変数nameに犬を代入
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	Dog(int num) {
	//コンストラクタ　引数num 作成
		this.num = num;
		
	}
}

