package kadai02;

class FutsuuState extends DogState {//ふつう状態
	private static FutsuuState s = new FutsuuState();
	private FutsuuState() {} //コンストラクタ
	
	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(IrairaState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}
	public String toString() {
		return "ふつう状態";
	}
	
}
