package classornek3;

public class UserServices {

	public void add(Users user) {
		if(user.getAge()>=15)
		{
			System.out.println(user.getFirstName()+" sisteme eklendi.");
		}
		
		
	}
	
	public void remove(Users user) {
		System.out.println(user.getFirstName()+" sistemden kaldirildi");
		
	}
	
	public Users[] getUsers() {
		
		Users user1= new Users();
		
		user1.setFirstName("Helin");
		user1.setLastName("Sever");
		user1.setAge(27);
		
		Users user2=new Users();
		
		user2.setFirstName("Alper");
		user2.setLastName("Tombul");
		user2.setAge(28);
		
		Users[] users= {user1, user2};
		
		return users;
	}
	
	public void listUsers(Users user) {
		
	System.out.println("Kisiler listeleniyor : ");
 
	   System.out.println(user.getFirstName()+" "+user.getLastName()+"   "+user.getAge());
   
     

	}
	
	
}
