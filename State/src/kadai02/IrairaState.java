package kadai02;

class IrairaState extends DogState {//イライラ状態
	private static IrairaState s = new IrairaState();
	private IrairaState() {} //コンストラクタ
	
	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(NeteruState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}
	public String toString() {
		return "イライラ状態";
	}
	
}
