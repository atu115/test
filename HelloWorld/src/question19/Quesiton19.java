package question19;
import java.util.Date;
import java.text.SimpleDateFormat;
//LocalDateTimeをインポート

public class Quesiton19{
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dogName = new Dog();
		//コンストラクタDog() をdogNameに格納
		System.out.println(dogName.name);
		//nameを出力
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dogNum = new Dog(15);
		//コンストラクタDog(num) をdogNumに格納
		System.out.println(dogNum.num);
		//numを出力
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd H:m:s" );
		//現在時刻をldtに格納
		System.out.println(format.format(date));
		//ldt出力
		
	}
}