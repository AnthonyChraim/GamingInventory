// -----------------------------------------------------
// Assignment 2
// Question: 1 part 1
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

//This is the beginning of the BoardGame class. The class is the sub class of the Game class. 
//It contains a default constructor, a parametrized constructor, a copy construcor, an equals method, a toString methods as well as accessors and mutators.

package Fourth;
import First.Game;

public class BoardGame extends Game{

	boolean timedTurns;
	
	//default constructor (initiate at false)
		public BoardGame () {
			this (false);
		}
		
		//parametrized constructor calling default super()
		public BoardGame(boolean timedTurns) {
			super();
			this.timedTurns = timedTurns;
		}
		
		//parametrized constructor calling parametrized super()
		public BoardGame (String name, int numPlayers, int gameTime, boolean timedTurns) {
			super(name, numPlayers, gameTime);
			this.timedTurns = timedTurns;
		}
		
		//copy constructor?
		public BoardGame (BoardGame bg) {
			super(bg);
			this.timedTurns = bg.timedTurns;
		}
		//equals method
		public boolean equals (BoardGame bg) {
			if (this == bg)
				return true;
			if (this == null || this.getClass() != bg.getClass())
				return false;
			return (this.timedTurns == bg.timedTurns);
		}
		
		//overriden toString method
		@Override
		public String toString() {
			return(super.getName() + " is a BoardGame. It contains " + super.getNumPlayers() + " players and the game time is " + super.getGameTime() +
					" minutes. The timed turns are " + timedTurns +". ");
		}

		//setters and getters

		public boolean getTimedTurns() {
			return timedTurns;
		}

		public void setTimedTurns(boolean timedTurns) {
			this.timedTurns = timedTurns;
		}


		
}
