package com.cg.day3_2;
import java.util.Random; 

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		
		
		int player_one_position=0;
		
		Random rand = new Random();//Instance of random class
		int randNumber=rand.nextInt(100);//Generating random number in between 0 and 100
		int numberCheck=(randNumber%6)+1;
		
		System.out.println("Welcome to Snake and Ladder game");
		
		System.out.println("Your Number is  : "+ numberCheck);
		

	}

}
