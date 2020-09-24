package com.cg.day3_2;
import java.util.Random; 

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		final int IS_LADDER=0;
		final int IS_SNAKE=1;
		final int NO_PLAY=2;
		
		
		Random rand = new Random();//Instance of random class
		System.out.println("Welcome to Snake and Ladder game");
		
		int player_one_position=0;
		while(player_one_position<=100) {
		
		int randNumber=rand.nextInt(100);//Generating random number in between 0 and 100
		int numberCheck=(randNumber%6)+1;
		
		System.out.println("Your Number is  : "+ numberCheck);
		int moveOption=rand.nextInt()%3;
		
		switch(moveOption) {
		case IS_LADDER:
			System.out.println("Ladder");
			player_one_position+=numberCheck;
			break;
		case IS_SNAKE:
			System.out.println("Snake");
			if(player_one_position>numberCheck)
				player_one_position-=numberCheck;
			else
				player_one_position=0;
			
			
			break;
		default:
			System.out.println("No move");
			
		
		}
		}
		
		System.out.println("Your Final position is: "+player_one_position);
		

	}

}
