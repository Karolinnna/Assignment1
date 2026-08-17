package com.shpp.p2p.cs.kbasysta.assignment1;

import com.shpp.karel.*;

public class Assignment1Part1 extends KarelTheRobot {

		public void run() throws Exception{
			boolean isTheEnd = false; //the mark to end program
			while(isTheEnd == false) {
				goToColumn();
				buildCoulumn();
				if(leftIsClear()) runToNextColumn();
				else isTheEnd = true;
			}
		}		
		
		/*
		 * Function to run to end of column
		 */
		public void goToColumn() throws Exception{
			while(notFacingNorth()) {
				turnLeft();
			}
			
			while(frontIsClear()) {
				move();
			}
		}
		
		/*
		 * put beepers till there isn`t a column
		 */
		public void buildCoulumn() throws Exception{
			while(notFacingSouth()) {
				turnLeft();
			}
			
			while(frontIsClear()) {
				if(beepersPresent()) move();
				else { 
						putBeeper();
					}
				}
			
				if(!beepersPresent()) {
					putBeeper();
				}
			}
		
		public void runToNextColumn() throws Exception{
			while(notFacingEast()) {
				turnLeft();
			}
			
			for(int i = 0; i < 4; i++) {
				move();
			}
		}
}
		


