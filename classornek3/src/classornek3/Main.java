package classornek3;

public class Main {

	public static void main(String[] args) {
		
		UserServices userServices=new UserServices();
		GameServices gameServices=new GameServices();
		Games game1=new Games();
		
		game1.setGameName("GTA");
		game1.setGamePrice(300);
		game1.setGameType("Action");
		
		Users user1=new Users();
		
		user1.setFirstName("Serhat");
		user1.setLastName("Kas");
		user1.setAge(8);
		
		Games game2=new Games("GTA","Action",300);
		
		Users user2=new Users("Serhat","Kas",27);
		
		
		userServices.listUsers(user2);
		userServices.listUsers(user1);
		
		userServices.add(user1);
		userServices.remove(user1);
		
		gameServices.add(game2);
		
		gameServices.listGames(game1);
		
		
		for(Games gameitem: gameServices.getGames()) {
			
			System.out.println(gameitem.getGameName()+" "+gameitem.getGameType()+" "+gameitem.getGamePrice());
		}
		
	
		
		
//		GameServices gameServices= new GameServices();
//		UserServices userServices= new UserServices();
//		
//		Users user3=new Users();
//		user3.FirstName="Zeynep";
//		user3.LastName="Tombul";
//		user3.age=8;
//		
//		Games game3=new Games();
//		game3.GameName="CS";
//		game3.GameType="Action";
//		game3.GamePrice=1000;
//		
//		
//		userServices.add(user3);
//		
//		userServices.remove(user3);
//		
//		userServices.listUsers(user3);
//		
//		gameServices.add(game3);
//		
//		
//		gameServices.remove(game3);
//		
//		gameServices.listGames(game3);
//		
//		Games[] result1=gameServices.getGames();
//		
//		Users[] result2=userServices.getUsers();
//		
//		for(Games gameitem: result1) {
//			System.out.println(gameitem.GameName+" "+gameitem.GameType+" "+gameitem.GamePrice);
//		}
//		
//		for(Users useritem: result2) {
//			System.out.println(useritem.FirstName+" "+useritem.LastName+" "+useritem.age);
//		}
//		
		
		
		
		


	}

}
