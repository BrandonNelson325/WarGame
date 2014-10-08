
public class players {
	public static void main(String[] args) {
		
		Player player = new Player ();

		player.setId(1);
		player.setFirstName("Alex");
		player.setLastName("Yolander");
		player.setAge(23);
		player.setUsername("AlexYo");
		player.setPassword("123123123");
		player.setColor("Blue");
		
		System.out.println("Last Name: " + player.getLastName() + " First Name: " + player.getFirstName());
	}
}
