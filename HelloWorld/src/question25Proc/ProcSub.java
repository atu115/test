package question25Proc;


//サブクラス---------------------------------
public class ProcSub extends ProcSuper{
	private String name ;
	private int hp ;
	private int mp ;
	private int power ;
	private int speed ;
	private int defense ;
	
	//コンストラクタ 初期値--------------------------
	public ProcSub(){
	}
	public ProcSub(String name){
		this.name = name;
	}
	
	//setter getter 
	//name setter getter---------------------
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	///hp setter getter---------------------
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp(){
		return this.hp;
	}
		
	//mp　setter getter---------------------
	public void setMp(int mp){
		this.mp = mp;
	}
	public int getMp(){
		return this.mp;
	}
	
	//power setter getter---------------------
	public void setPower(int power){
		this.power = power;
	}
	public int getPower(){
		return this.power;
	}
	
	//speed setter getter---------------------
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed(){
		return this.speed;
	}
		
	//defense setter getter---------------------
	public void setDefense(int defense){
		this.defense = defense;
	}
	public int getDefense(){
		return this.defense;
	}
}


