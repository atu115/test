package question17_18;
import java.util.Random;

public class Qquestion17_18 {
	
    //	出力
	public static void main(String[] args) {
		System.out.println("-question1-");
		question1();
		
		System.out.println("-question2-");
		question2(5);
		
		System.out.println("-question3-");
		question3(3,5);
		
		System.out.println("-question4-");
		question3(3.2,5.2);
		
		System.out.println("-question5-");
		question5(7);
		
		System.out.println("-question6-");
		question6(7);
	}

	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void question1() {
		System.out.println("Hello Java");
		
	}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static void question2(int num1) {
		System.out.println(num1 + 1);
	
	}
	
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static void question3(int num2,int num3) {
		System.out.println(num2*num3);
	}
	
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static void question3(double num4,double num5) {
		System.out.println(num4*num5);
	}
		
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] question5(int num6) {
		int random[] = new Random().ints(num6, 1, 100).toArray();
		for (int i = 0; i < num6; i++) {
	    System.out.println(random[i]);	
		}		
		return random;
		
//		Random random = new Random();
//		int nums[] = new int[num6];
//		for (int i = 0; i < num6; i++) {
//		nums[i] = random.nextInt(100);
//		System.out.println(nums[i]);
//		}
//		 return nums;
	}
	
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、
    //	受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static void question6(int num7) {
		int random[] = question5(num7);		
		int sum = 0;
		int Len = random.length;
		for (int i = 0; i < Len ; i++) {
    	sum = sum + random[i];
	}
		double avg = sum/Len;
		 System.out.println("平均"+avg);	
}
	
	

}