package question17_18;
import java.util.Random;

public class Qquestion17_18 {
	
    //	出力
	public static void main(String[] args) {
		System.out.println("-question1-");
		question1();
		//question1()出力
		
		System.out.println("-question2-");
		question2(5);
		//question2()出力
		
		System.out.println("-question3-");
		question3(3,5);
		//question3()出力
		
		System.out.println("-question4-");
		question3(3.2,5.2);
		//question3()出力
		
		System.out.println("-question5-");
		question5(5);
		//question5()出力
		
		System.out.println("-question6-");
		question6(question5(5));
		//question1(question5(5))出力
		
		System.out.println("-question7-");
		question7(question6(question5(5)));
		//question7(question6(question5(5)))出力
	}

	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void question1() {
		//question1() メソッドを作成
		System.out.println("Hello Java");
		
	}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static void question2(int num1) {
		//question2() 引数はnum1　メソッドを作成
		System.out.println(num1 + 1);
		//num1+1出力
	
	}
	
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static void question3(int num2,int num3) {
		//question3() 引数はnum2,num3　メソッドを作成
		System.out.println(num2*num3);
		//num2×num3出力
	}
	
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	// ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static void question3(double num4,double num5) {
		//question3() 引数は小数num4,num5　メソッドを作成
		System.out.println(num4*num5);
		//num4×num5出力
	}
		
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] question5(int num6) {
	//question5() 引数はnum6　メソッドを作成
		int[] random = new int[num6];
		//配列変数作成　個数はnum6
		Random ran = new Random();
		//ランダム数字　変数作成
		
		for (int i = 0; i < num6; i++) {
		//配列を出力するためのfor文　(iがnum6個になるまで1ずつたしていく)
	        random[i] = ran.nextInt(100)+1;
	        //配列[i]にランダムな数字を1から100まで入れる
			System.out.println(random[i]);
			//random[i]出力
		}
		return random;
		//戻り値
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、
    //	受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double question6(int[] num7) {	
	//question6() 引数は変数名num7　配列　メソッドを作成
		int Len = num7.length;
		//num7の数を数える
		int sum = 0;
		//配列の中身を足すため変数sumを定義
		double avg = 0;
		//配列の平均を出すために変数avgを定義
		
		for (int i = 0; i < Len ; i++) {
		//配列を出力するためのfor文　(iがLen個になるまで1ずつたしていく)
        	sum = sum + num7[i];
        	//配列をすべて足し　変数sumに格納
	}		
		
		avg = sum / Len;
		//平均をだし　変数avgに格納
   	 	System.out.println("平均"+avg);	
   	 	//平均avg出力
   	 	
   	 	return avg ;
   	 	//戻り値
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、
	//受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void question7(double num8) {	
	//question7() 引数は変数名num8　配列　メソッドを作成	
		if (num8 >= 50) {
		//50以上の時
			System.out.println(true);
			}
		else {
		//それ以外の時
			System.out.println(false);
		}
	}
			
}