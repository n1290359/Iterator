class Game {
	private String name;
	private int price;
	
	public Game(String name,int price) { //コンストラクタ
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
