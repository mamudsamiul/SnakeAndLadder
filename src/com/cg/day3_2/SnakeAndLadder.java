package com.cg.day3_2;
import java.util.Random; 

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder game");
		
		int player_one_position=0,counterOne=0,counterTwo=0,player_two_position=0,temp;
		boolean flag=true;
		while(player_one_position<100 && player_two_position<100) {
			if(flag==true)
			{
				counterOne++;
				System.out.println("---------------------------------Player One-------------------------------------");
				temp=player_one_position;
				player_one_position=DiceThrowing(player_one_position);
				if(player_one_position>temp)
					flag=true;
				else
					flag=false;
				
			}
			else
			{
				counterTwo++;
				System.out.println("---------------------------------Player Two-------------------------------------");
				temp=player_two_position;
				player_two_position=DiceThrowing(player_two_position);
				if(player_two_position>temp)
					flag=false;
				else
					flag=true;
				
			}
			
			
		
		}
		if(player_one_position>player_two_position) {
			System.out.println(" !! Winner is Player one!");
			System.out.println("Total steps are : "+counterOne);
		}
		else
		{
			System.out.println("!! Winner is Player Two!");
			System.out.println("Total steps are : "+counterTwo);
		
		}
		

	}
	
	
// Random number generator method
	
	static int randomGenerator()
	{
		Random rand = new Random();//Instance of random class
		int randomNumber=rand.nextInt(100);//Generating random number in between 0 and 100
		return randomNumber;
	}
	
//Dice throwing and position update method	
	
	static int DiceThrowing(int player_previous_position)
	{
		int player_position=player_previous_position;
		int numberCheck=(randomGenerator()%6)+1;
		
		int moveOption=randomGenerator()%3;
		System.out.println("Your Dice Number is  : "+ numberCheck);
		
		switch(moveOption) {
		case 0:
			System.out.println("Ladder");
			if(player_previous_position>=94 && (player_previous_position+numberCheck)!=100)
			{
				System.out.println("Better luck next time");
			}
			else
				player_position+=numberCheck;
			break;
		case 1:
			System.out.println("Snake");
			if(player_previous_position>numberCheck)
				player_position-=numberCheck;
			else
				player_position=0;
			
			
			break;
		default:
			System.out.println("No move");
			
		
		}
		System.out.println("Current position= "+player_position);
		return player_position;
	}

}
