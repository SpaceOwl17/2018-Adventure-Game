package adventure;

public class Enemy {
	public String name;
	public int hp;
	public int pow;
	public int armor;
	public int accuracy;
	public Item loot;

	public Enemy(String n, int hp, int pow, int armor, Item loot) {
		this.name = n;
		this.hp = hp;
		this.pow = pow;
		this.armor = armor;
		this.accuracy = 70;
		this.loot = loot;
	}
}
