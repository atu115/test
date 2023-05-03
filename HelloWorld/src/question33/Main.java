package question33;
// Mainクラス------------------------------------------------------------
	public class Main{
		public static void main(String[] argos){
			// Person 鈴木--------------------------------------------------
			Person person1 = new Person("鈴木","太郎", 20, 1.7, 60);
			person1.print();
			
			// Person 山田--------------------------------------------------
			Person person2 = new Person("山田","花子", 22, 1.5, 40);
			person2.print();
			
			System.out.println("合計" + Person.count + "人です");
			person1.printCount();
		}
	}

