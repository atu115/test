
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package question14;

public class Qquestion14 {

	public static void main(String[] args) {
		String alp[]= {"a","b","c","d","e","f","g","h","i","j"};
		
		for(int i=0; i < alp.length; i++) {
			if(i == 4){
				break;
			}
			System.out.println(alp[i]);
		}
	
	

		for(int i=0; i < alp.length; i++) {	
			if(i == 8){
				continue;
			}
			System.out.println(alp[i]);
		}
	}
}
