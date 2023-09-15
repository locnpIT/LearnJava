package Loc;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		player.name = "Loc";
		player.health = 20;
		player.weapon = "Gun";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healRemaining());
		
		player.loseHealth(11);
		System.out.println("Remaining health = " + player.healRemaining());
		
		EnhancePlayer thinh = new EnhancePlayer("Thinh", 200, "bom");
		System.out.println("Initial health is " + thinh.healRemaining());

	}

}
