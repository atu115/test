/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package question23;

public class Question23 {
	//フィールド
	private String name;
	private double height;
	private int speed;
	
	//setter
	void setName(String name) {
		this.name = name;
	}
	void setHeight(double height) {
		this.height = height;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getter
	String getName() {
		return this.name;
	}	
	double getHeight() {
		return this.height;
	}	
	int getSpeed() {
		return this.speed;
	}
	
	public static void main(String[] args){
		//クラス取得
		Question23 q = new Question23();
		
		//setterに挿入
		q.setName("ライオン");
		q.setHeight(2.1);
		q.setSpeed(80);
		
		//getterを変数に挿入
		String animalName = q.getName();
		double animalHeight = q.getHeight();
		int animalSpeed = q.getSpeed();
		
		
		System.out.println("動物:"+animalName);
		System.out.println("体長:"+animalHeight+"m");
		System.out.println("速度:"+animalSpeed+"km/h");
	}

}
