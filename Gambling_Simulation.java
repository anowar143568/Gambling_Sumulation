package com.bridgelabz;

public class Gambling_Simulation {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Gambling Simulator");
		
		final int PER_DAY_STAKE = 100;      //Per Day Stake is always $100
        final int PER_GAME_BET = 1;         //Per bet is always $1
     
	
	
        int winOrLose = (int) (Math.random() * 2);      //Bet happening using Math Random Function giving output 0 or 1

        switch (winOrLose) {
        
        case 0:         //Lose
        	
        	System.out.println("Lost this bet and total win today is "+ winOrLose);
            break;
        case 1:         //Win
        	
        	System.out.println("Won this bet and total win today is "+  winOrLose);
        default: System.out.println("Something Went Wrong, Try Again");
        }
		
	}
		
	}


	
	

