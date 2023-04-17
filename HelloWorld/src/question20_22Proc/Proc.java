package question20_22Proc;
import java.util.Date;
import java.text.SimpleDateFormat;

//クラス
public class Proc { 
	//フィールド
	public String Hello;
	public String sushi;
	public String washoku;
	public String today;
	
	//コンストラクタ　初期値
	public Proc(){
		this.Hello="こんにちは！ここは日本です！";
		this.sushi="この寿司はうまい";
		this.washoku="寿司は和食です";
		
		Date date =new Date();
		SimpleDateFormat format = new SimpleDateFormat( "yyyy/MM/dd H:m:s");
		this.today=format.format(date);
	}
}