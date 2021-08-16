package classornek3;

public class GameServices {

	public void add(Games game) {
		
		System.out.println(game.getGameName()+" oyunu Sisteme eklendi.");
		
	}
	
	public void remove(Games game) {
		System.out.println(game.getGameName()+" oyunu sistemden kaldirildi.");
	}
	
	public Games[] getGames() {
		
		Games game1=new Games();
		
		game1.setGameName("GTA");
		game1.setGameType("Action");
		game1.setGamePrice(300);
		
		Games game2=new Games();
		
		game2.setGameName("Sims");
		game2.setGameType("Action");
		game2.setGamePrice(500);
		
		Games[] games= {game1, game2};
		
		return games;
	}
	
	public void listGames(Games game) {
		
		System.out.println("Oyunlar listeleniyor : ");
	   
		   System.out.println(game.getGameName()+" "+game.getGameType()+"  "+game.getGamePrice());
	   
}
}
