/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array.java1_15;

public class Practice {

	public static void main(String[] args) {
		int test[][]={ 
		{64,73,69},
		{58,81,75},
		{86,68,79},
		{72,55,80},
		};
	System.out.println("生徒1：国語"+test[0][0]+"点、数学"+test[0][1]+"点、英語"+test[0][2]+"点");
	System.out.println("生徒2：国語"+test[1][0]+"点、数学"+test[1][1]+"点、英語"+test[1][2]+"点");
	System.out.println("生徒3：国語"+test[2][0]+"点、数学"+test[2][1]+"点、英語"+test[2][2]+"点");	
	System.out.println("生徒3：国語"+test[3][0]+"点、数学"+test[3][1]+"点、英語"+test[3][2]+"点");	
	
	int avgLanguage=(test[0][0]+test[1][0]+test[2][0]+test[3][0])/4;
	int avgMath=(test[0][1]+test[1][1]+test[2][1]+test[3][1])/4;
	int avgEnglish=(test[0][2]+test[1][2]+test[2][2]+test[3][2])/4;
	System.out.println("国語の平均点は"+avgLanguage+"点です。");
	System.out.println("数学の平均点は"+avgMath+"点です。");
	System.out.println("英語の平均点は"+avgEnglish+"点です。");

	
	
	}

}