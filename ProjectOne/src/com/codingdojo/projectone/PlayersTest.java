package com.codingdojo.projectone;
public class PlayersTest {
	public static void main(String[] args) {
		Players player = new Players();
		player.dribblingBall();
		player.passBall();
		player.settingScreen();
		player.startShooting();
		
		boolean shooting = player.isShooting();
		
		if(shooting) {
			System.out.println("Ingram makes a 3 pointer! And the Lakers take the lead!!");
		}
	}
}
