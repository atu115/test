package question25Proc;
import question25Run.Run25;

// 乱数インポート---------------------------------
import java.util.Random;
// コンソールスキャナー------------------------------
import java.util.Scanner;
public class ProcSuper {
	    public static void main() {
	    // クラス取得---------------------
	    ProcSub procSub = new ProcSub();
	    Run25 run = new Run25();

	    // ステータス乱数999まで作成------------------------
	    // 5個入る空のリスト-----------
	    int[] ran = new int[5];
	    	
	    // リストに乱数挿入------------------
	    for(int i=0;i<5;i++) {
	    Random rand = new Random();
	    ran[i]=rand.nextInt(1000);
        }
	    
	    // コンソール記入前指示------------------------------------
	    System.out.println("名前を入力してください");
	    
	    // スキャナー-----------------------------------------
		Scanner sc = new Scanner(System.in);
	    String line = sc.nextLine();
	    
	    // setterに挿入---------------------
	    procSub.setName(line);
	    procSub.setHp(ran[0]);
	    procSub.setMp(ran[1]);
	    procSub.setPower(ran[2]);
	    procSub.setSpeed(ran[3]);
	    procSub.setDefense(ran[4]);


	    // 出力-------------------------------------------------------------
	    System.out.println("こんにちは 「 "+ procSub.getName() +" 」 さん");
	    System.out.println("ステータス");
	    System.out.println("HP："+procSub.getHp());
	    System.out.println("MP："+procSub.getMp());
	    System.out.println("攻撃力："+procSub.getPower());
	    System.out.println("素早さ："+procSub.getSpeed());
	    System.out.println("防御力："+procSub.getDefense());
	    System.out.println(" ");
	    System.out.println("さあ冒険に出かけよう！");

	    }
}

