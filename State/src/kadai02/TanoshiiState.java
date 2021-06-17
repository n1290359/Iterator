package kadai02;

class TanoshiiState extends DogState {//楽しい状態
	private static TanoshiiState s = new TanoshiiState();
	private TanoshiiState() {} //コンストラクタ
	
	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(NeteruState.getInstance());
	}
	public String toString() {
		return "楽しい状態";
	}
	
}
