package adventure;

import java.util.Scanner;

public class Adventure {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Item SleepingPotion = new Item("Sleeping Potion", 0, 0, 0, 0, 0);
		Enemy BigFoot = new Enemy("Big Foot", 500, 500, 500, SleepingPotion);
		Enemy Alien = new Enemy("Alien", 7, 3, 0, new Item("Strength Potion", 5, 5, 5, 5, 5));
		System.out.println("101011110001");
		System.out.println("System.out.println... OH Sorry, your here, oops!");
		System.out.println("<----Enter anything to continue---or else-------->");
		scan.nextLine();
		
		System.out.println("Welcome Adventurer, you have come to play a game I randomly made up. Are you not ready?");
		System.out.println("Enter a Name for Your Hero...");
		
		String n = scan.nextLine();
		Hero h = new Hero(n, 1);
		h.printStats();
		System.out.println("You wake up in a dark room, with no memory of your life except for basic concepts, like English. You think you are in a space shuttle.");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("Once your head clears you look around and find an almost empty Sleeping Potion. You think you might need it later you take it.");
		h.pickup(SleepingPotion);
		System.out.println("You exit your room and think for a minute should I (scream) for help, or (explore) quietly");
		
		String scream = scan.nextLine();
		if (scream.equals("scream")) {
			System.out.println("An Alien Attacks from the Darkness!");
			System.out.println("Fighting it may grant loot...");
			h.printStats();
			System.out.println("(fight) or (run)");
			String choice = scan.nextLine();
			if (choice.equals("fight")) {
				h.fight(Alien);
			} else {
				System.out.println("You tried to escape but the alien shoots you in the back. You die");
				h.alive = false;
			}
		} else {
			//Explore
			
		}
		
		if (!h.alive) {
			gameover();
		}
		
		System.out.println("You start exploring and find a room full of aliens, thankfully, they are sleeping.");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		
		System.out.println("To make sure the Aliens wont wake up you dribble some of the sleeping potion into each of the aliens mouths");
		h.drop(0);
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("While passing out the potion you find a Spacebow3600 and a GalaxySword550. To bad you can only fit one in your inventory...");
		System.out.println("Which will you chose?");
		Item bow = new Item("Spacebow3600", 0, 0, 1, 0, 15);

		Item sword = new Item("GalaxySword550", 0, 0, 2, 0, 3);

		bow.stats();
		sword.stats();
		System.out.println("-----------");
		System.out.println("(take bow) or (take sword)");
		String choice = scan.nextLine();
		if (choice.equals("take bow")) {
			System.out.println("You pick up the bow");
			h.pickup(bow);
		} else {
			System.out.println("You pick up the sword");
			h.pickup(sword);
		}
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("You keep exploring and find a an alien guard asleep near a door.");
		System.out.println("You lean around the corner to see what the guard was guarding, as you do a metal tile scrapes against your shoe.");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("The guard wakes up, but you get close enough to realize it was an escape capsule");
		
		System.out.println("The alien guard attacks!");
		System.out.println("Fighting it may grant loot...");
		h.printStats();
		System.out.println("(fight) or (run)");
		choice = scan.nextLine();
		if (choice.equals("fight")) {
			boolean live = h.fight(Alien);
			if (!live) {
				gameover();
			}
				
		} else {
			System.out.println("You tried to escape but the alien shoots you in the back. You die");
			gameover();
		}
		System.out.println("You make it to the capsule and make a quick desicion, stay with hostile aliens, or escape.");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("You decide to escape so you get in the capsule and the friendly voice on the speaker counts down");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");	
		System.out.println("Launch!");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		System.out.println("After 24 hours in the tight capsule without food, you get pulled into a planets gravitational pull, and after a hot reentry you crash land onto the surface of the planet.");
		System.out.println("and after a hot reentry you crash land onto the surface of the planet.");
		System.out.println("You lose three HP");
		System.out.println("<---Enter Anything to continue--->");
		scan.nextLine();
		h.hp -= 3;
		h.printStats();
		System.out.println("You take a moment to breathe and you get out of the capsule. You have landed in an Artic Desert.");
		System.out.println("You have to decide to (explore) or make (camp)");
		String explore;
		explore = scan.nextLine();
		if (explore.equals("camp")) {
			System.out.println("While you were sleeping Big Foot came to eat you!");
			System.out.println("Fighting it may grant loot...");
			h.printStats();
			System.out.println("(fight) or (run)");
			choice = scan.nextLine();
			if (choice.equals("fight")) {
				boolean live = h.fight(BigFoot);
				if (!live) {
					gameover();
				}
					
			} else {
				System.out.println("You try to escape but he catches up to you with his long legs he slams you with his hammer. You die");
				gameover();
		       
		}
		
		}
		System.out.println("You start exploring, and come across a forest filled with fruit trees you eat some and your HP goes to normal");
		h.hp = h.hpmax;
		h.printStats();
		System.out.println("You decide to make camp");
		System.out.println("<-----Enter Anything to continue------>");
		scan.nextLine();
		System.out.println("---8 hours later---");
		System.out.println("While you were sleeping a Forest Monster came to eat you!");
		System.out.println("The Forest monster is to powerful to fight, but is very slow, you !can! run away.");
		h.printStats();			
		System.out.println("(fight) or (run)");
		choice = scan.nextLine();
		if (choice.equals("fight")) {
			boolean live = h.fight(new Enemy ("ForestMonster", 500, 500, 500, SleepingPotion));
			if (!live) {
					gameover();
				}
					
		} else {
			System.out.println("You escape, the Forest Monster sulkily walks back into the forest. You realize you're not in the forest.");
			System.out.println("You realize you are lost");
			System.out.println("<-----Enter Anything to continue------>");
			scan.nextLine();
			System.out.println("You turn in a 360 circle and it seems you are in another biome, a desert---the hot kind.");
			System.out.println("You walk in a random direction, and run to a wall, you think 'That was not here before'");
			System.out.println("You backup, and it turns invisible again, you walk in a random direction.");
			System.out.println("<-----Enter Anything to continue------>");
			scan.nextLine();
			System.out.println("You proceed to walk into another wall. you turn in a circle and find a purple portal");
			System.out.println("You walk into the portal.");
			System.out.println("<-----Enter Anything to continue------>");
			scan.nextLine();
			System.out.println("You survey your surroundings, You see a Boss, dressed in a nice suit, his red eyes gleam in the darkness");
			System.out.println("Behind the Boss you see your parents.");
			System.out.println("<-----Enter Anything to continue------>");
			scan.nextLine();
			h.printStats();			
			System.out.println("(fight) or (run) back through portal");
			choice = scan.nextLine();
			if (choice.equals("fight")) {
				boolean live = h.fight(new Enemy ("Boss", 20, 12, 0, SleepingPotion));
				if (!live) {
						gameover();
					}
						
			} else {
				System.out.println("You go back throught the portal (abandoning your parents), and face Barney, the purple dinosaur.");
				System.out.println("Barney kills you");
				gameover();
			}
			System.out.println("                    ");
			System.out.println("You run to your parents and awkardly say 'hi'");
			System.out.println("<----You win!---->");
			System.out.println("                  ");
			System.out.println("        *");
			System.out.println("        |");
			System.out.println("    ^ ^ ^ ^ ^ ");
			System.out.println("   \\  | |  //");
			System.out.println("    ---------");
			System.out.println("                  ");
			System.out.println("   A cake for u");
			System.out.println("<----Enter anything to continue---->");
			scan.nextLine();
			System.out.println("The lights went out... What was that noise? Oh Goodness Gracious");
			System.out.println("<----Enter anything to continue---->");
			scan.nextLine();
			System.out.println("Hello? Anyone---AHHHHHH!!!!!!!");
			System.out.println("To be, or not to be continued...");
			
		
		
		}
		
		
		
		
		
	
	}
	
	public static void gameover() {
		System.out.println("Gameover!");
		System.exit(0);
	}
}
