package classornek3;

public class Games {

	private String GameName;
	private String GameType;
	private double GamePrice;
	
	public Games() {}
	public Games(String GameName, String GameType, double GamePrice) {
		
		this.GameName = GameName;
		this.GameType = GameType;
	     this.GamePrice = GamePrice;
	}
	public String getGameName() {
		return this.GameName;
	}
	public void setGameName(String gameName) {
		this.GameName = gameName;
	}
	public String getGameType() {
		return this.GameType;
	}
	public void setGameType(String gameType) {
		this.GameType = gameType;
	}
	public double getGamePrice() {
		return this.GamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.GamePrice = gamePrice;
	}
	

	
	
	
	
}
