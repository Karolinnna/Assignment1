package com.shpp.p2p.cs.kbasysta.assignment1;

import com.shpp.karel.*;

public class Assignment1Part2 extends KarelTheRobot{
	int numOfCells = 1;
	int avg = 0;
	
	public void run() throws Exception{
		countCell();
		findAvg();
		goToAvg();
	}
	
	public void countCell() throws Exception{
		
		while(notFacingEast()) {
			turnLeft();
		}
		
		while(frontIsClear()) {
			move();
			numOfCells++;
		}
	}
	
	/*
	 * find the number of average cell
	 */
	public void findAvg() throws Exception{
		avg = numOfCells/2 + 1;
		System.out.println(avg);
	}
	
	
	/*
	 * Go to average cell
	 */
	public void goToAvg() throws Exception{
		while(notFacingWest()) {
			turnLeft();
		}
		
		for(int i = 0; i<avg-1; i++) {
			move();
			putBeeper();
		}
	}
}

 
