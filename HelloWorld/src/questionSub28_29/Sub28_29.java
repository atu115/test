package questionSub28_29;

public class Sub28_29 {
	public String[] pref = new String[11];
	public String[] city = new String[11];
	public String[] area = new String[11];

		
		public void message(int i) {
			System.out.println("都道府県名："+ pref[i]);
			System.out.println("県庁所在地："+ city[i]);
			System.out.println("面積："+ area[i]+"km2");
			System.out.println(" ");
	}
}


