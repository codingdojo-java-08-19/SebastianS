package com.codingdojo.objectmasterparttwo;

public class HumanTest {

	public static void main(String[] args) {
		Human player1 = new Human();
		Wizard player2 = new Wizard();
		Samurai player3= new Samurai();
		Ninja player4 = new Ninja();
		Samurai player5= new Samurai();
		
		System.out.println(player1.getHealth());
		player2.fireball(player1);
		System.out.println(player1.getHealth());
		player2.heal(player1);
		System.out.println(player1.getHealth());
		
		System.out.println(player3.getHealth());
		player4.steal(player3);
		System.out.println(player3.getHealth());
		System.out.println(player4.getHealth());
		
		player4.runAway();
		System.out.println(player4.getHealth());
		
		System.out.println(player1.getHealth());
		player5.deathBlow(player1);
		System.out.println(player1.getHealth());
		System.out.println(player5.getHealth());
		player5.meditate();
		System.out.println(player5.getHealth());
		System.out.println(player5.howMany());
		
		
		
	}

}
