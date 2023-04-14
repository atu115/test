package question20_22Proc;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Proc { 
	Date date;
	SimpleDateFormat today;
	
	public Proc(){
		this.date = new Date();
		this.today = new SimpleDateFormat( "yyyy/MM/dd H:m:s" );
		
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は"+today.format(date)+"です");
		
	}	
}