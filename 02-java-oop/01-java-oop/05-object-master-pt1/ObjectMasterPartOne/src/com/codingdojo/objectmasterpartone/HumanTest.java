package com.codingdojo.objectmasterpartone;

public class HumanTest {

	public static void main(String[] args) {
		Human player1 = new Human();
		Human player2 = new Human();
		
		System.out.println(player2.getHealth());
		System.out.println(player1.attack(player2));
	}

}
