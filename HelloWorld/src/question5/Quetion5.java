package question5;

public class Quetion5 {
	public static void main(String[] args) {
//		問１）
//		コンソールに以下のような自己紹介を自分の情報で出力してください。
//		※但し、「名前、性別、年齢、身長」は変数に代入して、出力するようにしてください。
//		※性別は「男」か「女」の一文字、身長は小数点第一位までのかたちで表示されるようにして下さい。
//		
//		例）
//		私の自己紹介をします。
//		名前は山田太郎です。
//		性別は男です。
//		年齢は19歳です。
//		身長は174.2㎝です。
//		よろしくお願いします。
		String name ="中田敦史";
		char sex ='男';
		int age =26;
		double height=175.0;
		
		System.out.println("私の自己紹介をします。");
		System.out.println("名前は"+name+"です。");
		System.out.println("性別は"+sex+"です。");
		System.out.println("身長は"+height+"です。");
		System.out.println("よろしくお願いします。");
	}
}
