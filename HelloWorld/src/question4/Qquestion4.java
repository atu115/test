package question4;

public class Qquestion4 {

	public static void main(String[] args) {
//		問１）
//		次のプログラムを実行すると「num1+num2は3030」という結果が表示されます。
//		「num1+num2は60」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		int num1 = 30;
		int num2 = 30;
		System.out.println("num1+num2は" + (num1 + num2));

//		問２）
//		次のプログラムを完成させてください。
//		String型の name変数 〇〇を自分の名前に変えてください。
//		System.out.println()を使って「（名前）はjavaを学習しています。」と画面に表示してください。
		String name = "中田敦史は";
		String message = "javaを学習しています。";
		System.out.println(name+message);
	}
}
