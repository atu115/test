/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

package question26_28;
//
import java.util.Scanner;


class Question26_28 {
	String[] name=new String[6];
	String[] height=new String[6];
	String[] speed=new String[6];
	
	
	// メソッドの宣言・定義---------------------------
	void message(){
		
		//出力繰り返し表示
		for(int i=0; i<=5;i++) {
			//出力結果-------------------------------
			System.out.println("動物名："+name[i]);
			System.out.println("体長："+height[i]+"m");
			System.out.println("速度："+speed[i]+"km/h");
	
			 if("ライオン".equals(name[i]) ) {
			    	System.out.println("学名：パンテラ レオ");
			    }
			 else if("ゾウ".equals(name[i])) {
			    	System.out.println("学名：ロキソドンタ・サイクロティス");
			    }
			 else if("パンダ".equals(name[i])) {
			    	System.out.println("学名：アイルロポダ・メラノレウカ");
			    }
			 else if("シマウマ".equals(name[i])) {
			    	System.out.println("学名：チャップマンシマウマ");
			    }
			 else if("インコ".equals(name[i])) {
			    	System.out.println("学名：不明");
			    }
			 
			 System.out.println(" ");
		}
	}
	
}

//Mainクラス------------------------------------------	
public class Main {	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// インスタンス(オブジェクト)を生成------------------------------
		Question26_28 q = new Question26_28();

		// Scannerクラスのインスタンスを作成---------------------------
	    // 引数で標準入力System.inを指定する
		
		//コンソール指示-----------------------------------
		System.out.println("「動物名:体長：速度」を入力");
		
		//スキャナー定義-----------------------------------
		Scanner sc = new Scanner(System.in);
	    String line = sc.nextLine();
	    sc.close();
	    
	    
	    
	    //配列分割---------------------------------------
	    String[] animal = line.split(",");
	    String[] animalData0 = animal[0].split(":");
		String[] animalData1 = animal[1].split(":");
		String[] animalData2 = animal[2].split(":");
		String[] animalData3 = animal[3].split(":");
		String[] animalData4 = animal[4].split(":");
		String[] animalData5 = animal[5].split(":");
		
		
	    
	    //「動物名:体長：速度」をフィールドに挿入------------------
		//ライオン--------------------------
		q.name[0] = animalData0[0];
		q.speed[0] = animalData0[1];
		q.height[0] = animalData0[2];
	    
		//ゾウ-----------------------------
		q.name[1] = animalData1[0];
		q.speed[1] = animalData1[1];
		q.height[1] = animalData1[2];
		
		//パンダ-----------------------------
		q.name[2] = animalData2[0];
		q.speed[2] = animalData2[1];
		q.height[2] = animalData2[2];
		
		//チンパンジー-------------------------
		q.name[3] = animalData3[0];
		q.speed[3] = animalData3[1];
		q.height[3] = animalData3[2];
		
		//シマウマ----------------------------
		q.name[4] = animalData4[0];
		q.speed[4] = animalData4[1];
		q.height[4] = animalData4[2];
		
		//インコ-------------------------------
		q.name[5] = animalData5[0];
		q.speed[5] = animalData5[1];
		q.height[5] = animalData5[2];
		
		
		//出力-------------------------------
		q.message();
		
	}
	
}
