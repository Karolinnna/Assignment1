package com.shpp.p2p.cs.kbasysta.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot{
	public void run() throws Exception{
		while(frontIsClear()) {
			checkerLine();
			goNextLine();
		}
	}
	
	/*
	 * Set beeper every other time
	 */
	public void checkerLine() throws Exception{
		while(frontIsClear()) {
			move();
			putBeeper();
			if(frontIsClear()) {
				move();
			}
		}
	}
	
	
	public void goNextLine() throws Exception{
		turnNorth();
		if(frontIsClear()) {
			move();
			if(rightIsBlocked()) turnWest();
			else turnEast();
		}
	}
	
	
	public void turnNorth() throws Exception{
		while(notFacingNorth()) {
			turnLeft();
		}
	}
	
	public void turnWest() throws Exception{
		while(notFacingWest()) {
			turnLeft();
		}
	}
	
	public void turnEast() throws Exception{
		while(notFacingEast()) {
			turnLeft();
		}
	}
}
