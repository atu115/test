package question8;

public class Question8 {
	public static void main(String[] args) {
//		問１）
//		以下の変数を使ってboolean型変数 result_1 に「変数 a の値は変数 b の値以上」という条件式を代入して下さい。
//		boolean型変数 result_1 をコンソールに出力して下さい。 
		int a = 20;
		int b = 5;
		boolean result_1 = a >= b;
		System.out.println(result_1);

//		問２）
//		以下の変数を使ってboolean型変数 result_2 に「変数 c の値と変数 d の値は等しくない」という条件式を代入して下さい。
//		boolean型変数 result_2 をコンソールに出力して下さい。
		int c = 5;
		int d = 10;
		boolean result_2 = c != d;
		System.out.println(result_2);
		
//		問３）
//		以下の変数を使ってboolean型変数 result_3 に「変数 e の値は10より大きい かつ 変数 f の値は10未満」という条件式を代入して下さい。
//		boolean型変数 result_3 をコンソールに出力して下さい。
		int e = 12;
		int f = 8;
		boolean result_3 =  e > 10 && f < 10;
		System.out.println(result_3);
		
//		問４）
//		以下の変数を使ってboolean型変数 result_4 に「変数 g の値は5以下 または 変数 g の値は10以上」という条件式を代入して下さい。
//		boolean型変数 result_4 をコンソールに出力して下さい。
		int g = 7;
		boolean result_4 =  g <= 5 || g >= 10;
		System.out.println(result_4);
		
	}
}
