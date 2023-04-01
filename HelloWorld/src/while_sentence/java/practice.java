/*
	問題．while文を使用し、以下のプログラムを作成してください。
		・1～100を出力
		・奇数の数字に「〇は奇数です」と出力
		・偶数の数字に「○は偶数です」と出力
		  出力結果  1は奇数です
					2は偶数です
					3は奇数です
					4は偶数です
						・
						・
						・
					100は偶数です
*/
package while_sentence.java;

public class practice {

	public static void main(String[] args) {
		int i = 0;
		while(i<100){
			++i;	
			if(i%2 != 0) {System.out.println(i+"は奇数です。");
			}
			else if(i%2 == 0){System.out.println(i+"は偶数です。");
			}
		}

	}
}
