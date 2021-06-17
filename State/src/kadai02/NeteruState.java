package kadai02;

class NeteruState extends DogState {//イライラ状態
	private static NeteruState s = new NeteruState();
	private NeteruState() {} //コンストラクタ
	
	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		//なにもしない
	}
	public void tabeta(Dog moto) {
		//なにもしない
	}
	public String toString() {
		return "寝てる状態";
	}
	
}
